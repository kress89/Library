package hr.kreso.ucenje.desktop;

import hr.kreso.ucenje.facade.UcenjeFacade;
import hr.kreso.ucenje.model.Book;
import hr.kreso.ucenje.util.SpringFactory;
import org.eclipse.jface.action.CoolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.StatusLineManager;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.*;

public class TableApp extends ApplicationWindow {



    private Table table;
    private TableViewer tableViewer;
    private Composite composite;
    private Shell shell;

    private UcenjeFacade ucenjeFacade = SpringFactory.getUcenjeFacade();

    public TableApp(){
        super(null);
        setShellStyle(SWT.CLOSE | SWT.MIN | SWT.MAX | SWT.RESIZE);
        createActions();
        addCoolBar(SWT.FLAT);
        addMenuBar();
        addStatusLine();
    }


    @Override
    protected Control createContents(Composite parent) {

        Composite container = new Composite(parent, SWT.NONE);
        container.setLayout(new GridLayout(1, false));

        Composite composite = new Composite(container, SWT.NONE);
        composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

        TableColumnLayout layout = new TableColumnLayout();
        composite.setLayout(layout);

        tableViewer = new TableViewer(composite, SWT.BORDER | SWT.FULL_SELECTION);
        table = tableViewer.getTable();
        table.setHeaderVisible(true);
        table.setLinesVisible(true);



        //tableViewer.setLabelProvider(new TableLabelProvider());
        tableViewer.setContentProvider(new ArrayContentProvider());

        return container;
    }

    private void createActions(){

    }


    @Override
    protected MenuManager createMenuManager() {
        MenuManager menuManager = new MenuManager("menu");
        return menuManager;
    }

    @Override
    protected StatusLineManager createStatusLineManager() {
        StatusLineManager statusLineManager = new StatusLineManager();
        return statusLineManager;
    }

    @Override
    protected CoolBarManager createCoolBarManager(int style) {
        CoolBarManager coolBarManager = new CoolBarManager(style);
        return coolBarManager;
    }

    @Override
    protected void configureShell(Shell shell) {
        super.configureShell(shell);
        shell.setText("TableApp");
    }


    public static void main(String[] args) {
        try{
            TableApp window = new TableApp();
            window.setBlockOnOpen(true);
            window.open();
            Display.getCurrent().dispose();
        }catch(Exception e){
            e.printStackTrace();
        }
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
}
