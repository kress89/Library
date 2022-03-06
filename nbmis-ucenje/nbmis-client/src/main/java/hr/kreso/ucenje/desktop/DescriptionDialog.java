package hr.kreso.ucenje.desktop;

import hr.kreso.ucenje.facade.UcenjeFacade;
import hr.kreso.ucenje.model.Book;
import hr.kreso.ucenje.util.SpringFactory;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.ShellAdapter;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.*;

public class DescriptionDialog extends Dialog {

private Composite composite;
private Text txtBookId;
private Text txtCategoryId;
private Text txtPublicationDate;
private Text txtCopiesOwned;
private Text txtStatusEnum;
private Text txtTitle;
private Text txtDescription;
private UcenjeFacade ucenjeFacade = SpringFactory.getUcenjeFacade();
    private Shell shell;
    private Book book;
    private Composite cmpBottom;
    private Button btnClear;
    private int btnClicked;
    private Display display;
    private Button btnEdit;

    public Text getTxtTitle() {
        return txtTitle;
    }

    public void setTxtTitle(Text txtTitle) {
        this.txtTitle = txtTitle;
    }

    public Text getTxtBookId() {
        return txtBookId;
    }

    public void setTxtBookId(Text txtBookId) {
        this.txtBookId = txtBookId;
    }

    public Text getTxtCategoryId() {
        return txtCategoryId;
    }

    public void setTxtCategoryId(Text txtCategoryId) {
        this.txtCategoryId = txtCategoryId;
    }

    public Text getTxtPublicationDate() {
        return txtPublicationDate;
    }

    public void setTxtPublicationDate(Text txtPublicationDate) {
        this.txtPublicationDate = txtPublicationDate;
    }

    public Text getTxtCopiesOwned() {
        return txtCopiesOwned;
    }

    public void setTxtCopiesOwned(Text txtCopiesOwned) {
        this.txtCopiesOwned = txtCopiesOwned;
    }

    public Text getTxtStatusEnum() {
        return txtStatusEnum;
    }

    public void setTxtStatusEnum(Text txtStatusEnum) {
        this.txtStatusEnum = txtStatusEnum;
    }

    public Text getTxtDescription() {
        return txtDescription;
    }

    public void setTxtDescription(Text txtDescription) {
        this.txtDescription = txtDescription;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public DescriptionDialog(Shell parentShell, Book book){
        super(parentShell);
        this.book = book;
        createShell(parentShell);
        createContents(shell);
        popuniPolja();
    }

    private void popuniPolja() {
        txtTitle.setText(book.getTitle() == null ? "" : book.getTitle());
        if (book.getDescription() != null) {
            txtDescription.setText(book.getDescription());
        }
        if(String.valueOf(book.getBookId()) != null){
            txtBookId.append(String.valueOf(book.getBookId()));
        }
         if(String.valueOf(book.getCategoryId()) != null){
             txtCategoryId.setText(String.valueOf(book.getCategoryId()));
         }

        if(book.getPublicationDate() != null){
            txtPublicationDate.setText(String.valueOf(book.getPublicationDate()));
        }
        txtCopiesOwned.setText(String.valueOf(book.getCopiesOwned()));

        if(book.getStatusEnum() != null){
            txtStatusEnum.setText(String.valueOf(book.getStatusEnum()));
        }
    }

    @Override
    public int open() {
        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
        return btnClicked;
    }

    private void createShell(Shell parent) {
        int modal = SWT.APPLICATION_MODAL;
        int style = SWT.TITLE | SWT.BORDER | SWT.DIALOG_TRIM | modal;
        display = Display.getDefault();

        shell = new Shell(parent, style);
        // TODO složi font
//        shell.setFont(font);
        shell.setText("Details Dialog");
        shell.setLayout(new GridLayout(1, true));
        shell.addShellListener(new ShellAdapter() {
            @Override
            public void shellClosed(org.eclipse.swt.events.ShellEvent e) {
                shell.dispose();
            }
        });
    }

    @Override
    protected Control createContents(Composite parent) {
        this.composite = (Composite) super.createDialogArea(parent);

        GridLayout layout = new GridLayout(1, false);
        layout.marginHeight = 5;
        layout.marginWidth = 10;

        composite.setLayout(layout);

        createContent();

        return composite;
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        return super.createDialogArea(parent);
    }


    @Override
    protected void createButtonsForButtonBar(Composite parent) {
        super.createButtonsForButtonBar(parent);
    }


    private void createContent(){
        createTopContent();
        createBottomContent();
    }

    private  void createTopContent() {
        Composite top = new Composite(composite, SWT.NONE);

        top.setLayout(new GridLayout(2, false));
        top.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

        Label thirdLabel = new Label(top, SWT.NONE);
        thirdLabel.setText("Book ID: ");
        txtBookId = new Text(top, SWT.BORDER | SWT.WRAP | SWT.MULTI);
        txtBookId.setEditable(true);
        txtBookId.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true));

        Label firstLabel = new Label(top, SWT.NONE);
        firstLabel.setText("Book Title: ");
        txtTitle = new Text(top, SWT.BORDER | SWT.WRAP | SWT.MULTI);
        txtTitle.setEditable(true);
        txtTitle.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true));




        Label fourLabel = new Label(top, SWT.NONE);
        fourLabel.setText("Book CategoryId: ");
        txtCategoryId = new Text(top, SWT.BORDER | SWT.WRAP | SWT.MULTI);
        txtCategoryId.setEditable(true);
        txtCategoryId.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true));

        Label fiveLabel = new Label(top, SWT.NONE);
        fiveLabel.setText("Book PublicationDate: ");
        txtPublicationDate = new Text(top, SWT.BORDER | SWT.WRAP | SWT.MULTI);
        txtPublicationDate.setEditable(true);
        txtPublicationDate.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true));

        Label sixLabel = new Label(top, SWT.NONE);
        sixLabel.setText("Book's Copies owned: ");
        txtCopiesOwned = new Text(top, SWT.BORDER | SWT.WRAP | SWT.MULTI);
        txtCopiesOwned.setEditable(true);
        txtCopiesOwned.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true));

        Label seventhLabel = new Label(top, SWT.NONE);
        seventhLabel.setText("Book's StatusEnum: ");
        txtStatusEnum = new Text(top, SWT.BORDER | SWT.WRAP | SWT.MULTI);
        txtStatusEnum.setEditable(true);
        txtStatusEnum.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true));

        Label secondLabel = new Label(top, SWT.NONE);
        secondLabel.setText("Book Description: ");
        txtDescription = new Text(composite, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
        GridData data = new GridData(GridData.FILL_BOTH);
        txtDescription.setLayoutData(data);



    }

    private void createBottomContent() {
        cmpBottom = new Composite(composite, SWT.NONE);
        cmpBottom.setLayout(new GridLayout(3, false));
        cmpBottom.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        btnClear = new Button(cmpBottom, SWT.CLOSE);
        btnClear.setText("Close Dialog");
        btnClear.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
              shell.close();
            }
        });

        btnEdit = new Button(cmpBottom, SWT.NONE);
        btnEdit.setText("Edit Description");
        btnEdit.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                //TODO Call database to save new change in description field!!

                String changedDescription = txtDescription.getText();
                book.setDescription(changedDescription);

                int updateDescription = ucenjeFacade.updateBooks(book);
                if(updateDescription == -1){
                    System.out.println("Update failed");
                }else{
                    System.out.println("Column description updated!");
                }
            }
        });
    }

}
