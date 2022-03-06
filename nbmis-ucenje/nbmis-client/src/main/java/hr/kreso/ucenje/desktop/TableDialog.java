package hr.kreso.ucenje.desktop;

import hr.kreso.ucenje.facade.UcenjeFacade;
import hr.kreso.ucenje.model.Book;
import hr.kreso.ucenje.model.StatusEnum;
import hr.kreso.ucenje.util.SpringFactory;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class TableDialog  extends Dialog {

    private Composite composite;
    private Table table;
    private TableViewer tableViewer;
    private UcenjeFacade ucenjeFacade = SpringFactory.getUcenjeFacade();
    private Text firstText;
    private Label label;
    private Combo combo;
    private Book book;





    public TableDialog(Shell parentShell){
        super(parentShell);
        setShellStyle(parentShell.getStyle() | SWT.CLOSE | SWT.TITLE | SWT.BORDER | SWT.APPLICATION_MODAL);
        setBlockOnOpen(true);
        parentShell.setSize(1000, 500);
    }

    protected Control createDialogArea(Composite parent){
        this.composite = (Composite) super.createDialogArea(parent);

        GridLayout layout = new GridLayout(1, false);
        layout.marginHeight = 5;
        layout.marginWidth = 10;

        composite.setLayout(layout);

        createContent();

        return composite;
    }

    private void createContent(){
        createTopContent();

        createMiddleContent();

        createBottomContent();
    }

    private void createTopContent(){

        Composite top = new Composite(composite, SWT.NONE);

        top.setLayout(new GridLayout(2, false));
        top.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

        Label firstLabel = new Label(top, SWT.NONE);
        firstLabel.setText("Enter user criteria: ");
        firstText = new Text(top, SWT.BORDER);
        firstText.setEditable(true);
        firstText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true));

        firstText.addVerifyListener(new VerifyListener() {
            @Override
            public void verifyText(VerifyEvent verifyEvent) {
                verifyEvent.text= verifyEvent.text.toUpperCase();
            }
        });



        RowLayout rowLayout = new RowLayout();
        rowLayout.marginLeft = 130;
        rowLayout.marginTop = 130;
        getParentShell().setLayout(rowLayout);

        label = new Label(top, SWT.NONE);
        label.setText("Select Status");

        combo = new Combo(top, SWT.DROP_DOWN);
        String[] items = {"ACTIVE", "PASSIVE", ""};
        combo.setItems(items);

        /*Label secondLabel = new Label(top, SWT.NONE);
        secondLabel.setText("Enter another user criteria: ");
        Text secondText = new Text(top, SWT.BORDER);
        secondText.setEditable(true);
        secondText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true));*/
    }



    private void createMiddleContent() {

        Composite middle = new Composite(composite, SWT.FULL_SELECTION);
        middle.setLayout(new GridLayout(3, false));
        middle.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        Group group = new Group(middle, SWT.NONE);
        group.setLayout(new GridLayout(1, false));
        group.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));


        tableViewer = new TableViewer(group, SWT.BORDER | SWT.FULL_SELECTION);
        tableViewer.getTable().setLayout(new GridLayout(1, false));
        tableViewer.getTable().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        table = tableViewer.getTable();
        table.setHeaderVisible(true);
        table.setLinesVisible(true);

        String[] titles = {"BookId", "Title", "CategoryId", "PublicationDate", "CopiesOwned", "StatusEnum"};
        int[] bounds = {150, 150, 100, 150, 100, 100};

        TableViewerColumn column = createTableViewerColumn(titles[0], bounds[0], 0);
        column = createTableViewerColumn(titles[1], bounds[1], 1);
        column = createTableViewerColumn(titles[2], bounds[2], 2);
        column = createTableViewerColumn(titles[3], bounds[3], 3);
        column = createTableViewerColumn(titles[4], bounds[4], 4);
        column = createTableViewerColumn(titles[5], bounds[5], 5);

        final Composite buttonBar = new Composite(middle, SWT.NONE);
        final GridData data = new GridData(SWT.FILL, SWT.RIGHT, true, true);
        data.grabExcessHorizontalSpace = true;
        data.grabExcessVerticalSpace = false;
        buttonBar.setLayoutData(data);

        buttonBar.setFont(middle.getFont());

        Button details = new Button(buttonBar, SWT.PUSH);

        details.setText("Open Details");
        details.setBounds(0,120,75,30);
        details.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                IStructuredSelection selection = (IStructuredSelection) tableViewer.getSelection();
                Object item = selection.getFirstElement();
                Book redUTablici = (Book) item;
                System.out.println(redUTablici);

                DescriptionDialog descriptionDialog = new DescriptionDialog(getParentShell(), redUTablici);
                int onoStoVratiButton = descriptionDialog.open();
            }
        });

        Button addNewBook = new Button(buttonBar, SWT.PUSH);
        addNewBook.setText("Add Book");
        addNewBook.setBounds(0,0,75,30);
        addNewBook.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                InsertBookDialog insertBookDialog = new InsertBookDialog(getParentShell(), new Book());
                int returnFromButton = insertBookDialog.open();
            }
        });



        tableViewer.setLabelProvider(new TableLabelProvider());
        tableViewer.setContentProvider(new ArrayContentProvider());


    }
    private TableViewerColumn createTableViewerColumn(String header, int width, int idx){
        TableViewerColumn column = new TableViewerColumn(this.tableViewer, SWT.LEFT, idx);
        column.getColumn().setText(header);
        column.getColumn().setWidth(width);
        column.getColumn().setResizable(true);
        column.getColumn().setMoveable(true);

        return column;
    }


    private void createBottomContent()
    {
        Composite bottom = new Composite(composite, SWT.NONE);
        bottom.setLayout(new GridLayout(3, false));
        bottom.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        Button clear = new Button(bottom, SWT.PUSH);
        clear.setText("Clear");

        clear.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true));
        Button add = new Button(bottom, SWT.PUSH);
        add.setText("Search");
        add.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true));

        clear.addSelectionListener(new SelectionAdapter(){
            @Override
            public void widgetSelected(SelectionEvent selectionEvent) {
                tableViewer.setInput(new ArrayList<>());
            }
        });


        add.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent selectionEvent) {
                Map<String, Object> params = new HashMap<>();
                String text = firstText.getText();
                String selected = combo.getText();

                if (text != null && !text.isEmpty()) {
                    params.put("title", text);
                }

                StatusEnum status = StatusEnum.getStatusEnumFromName(selected);
                params.put("status_enum", status.getCode());

                java.util.List<Book> books = ucenjeFacade.fetchBooksByCriteria(params);

                tableViewer.setInput(books);
            }
        });
    }
    protected void configureShell(Shell newShell)
    {
        super.configureShell(newShell);
        newShell.setText("Application Library");
    }



    @Override
    protected Control createButtonBar(Composite parent) {
       return  super.createButtonBar(parent);

    }

    public static class TableLabelProvider extends LabelProvider implements ITableLabelProvider {

        @Override
        public Image getColumnImage(Object o, int i) {
            return null;
        }

        @Override
        public String getColumnText(Object o, int i) {
            Book book = (Book) o;
            String result = "";

            switch (i){
                case 0:
                    result = String.valueOf(book.getBookId());
                    break;
                case 1:
                    result = book.getTitle();
                    break;
                case 2:
                    result = String.valueOf(book.getCategoryId());
                    break;
                case 3:
                    result = String.valueOf(book.getPublicationDate());
                    break;
                case 4:
                    result = String.valueOf(book.getCopiesOwned());
                    break;
                case 5:
                    result = String.valueOf(book.getStatusEnum());
                    break;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        new TableDialog(new Shell()).open();
    }

}

