package 课程设计;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.Table;

public class 员工界面 {

	protected Shell shell;
	private Table table;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			员工界面 window = new 员工界面();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("\u7BA1\u7406\u754C\u9762");
		
		ToolBar toolBar = new ToolBar(shell, SWT.FLAT | SWT.RIGHT);
		toolBar.setBounds(0, 0, 158, 28);
		
		ToolItem tltmNewItem = new ToolItem(toolBar, SWT.NONE);
		tltmNewItem.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		tltmNewItem.setText("\u4E0B\u8F7D\u6587\u4EF6");
		
		ToolItem tltmNewItem_1 = new ToolItem(toolBar, SWT.NONE);
		tltmNewItem_1.setText("\u63D0\u4EA4");
		
		ToolItem toolItem = new ToolItem(toolBar, SWT.NONE);
		toolItem.setText("\u8D28\u8BE2");
		
		ToolBar toolBar_1 = new ToolBar(shell, SWT.FLAT | SWT.RIGHT);
		toolBar_1.setBounds(290, 0, 142, 28);
		
		ToolItem tltmNewItem_2 = new ToolItem(toolBar_1, SWT.NONE);
		tltmNewItem_2.setText("\u4E2A\u4EBA\u4FE1\u606F\u67E5\u8BE2");
		
		ToolItem tltmNewItem_3 = new ToolItem(toolBar_1, SWT.NONE);
		tltmNewItem_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.close();
			}
		});
		tltmNewItem_3.setText("\u767B\u51FA");
		
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setBounds(0, 34, 158, 110);
		
		table = new Table(composite, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(0, 0, 158, 110);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		Composite composite_1 = new Composite(shell, SWT.NONE);
		composite_1.setBounds(0, 144, 158, 109);
		
		Button button = new Button(composite_1, SWT.NONE);
		button.setBounds(23, 0, 98, 30);
		button.setText("\u8BF7\u5047");
		
		Button btnNewButton = new Button(composite_1, SWT.NONE);
		btnNewButton.setBounds(23, 36, 98, 30);
		btnNewButton.setText("\u4EFB\u52A1\u62A5\u9519");
		
		Button btnNewButton_1 = new Button(composite_1, SWT.NONE);
		btnNewButton_1.setBounds(23, 72, 98, 30);
		btnNewButton_1.setText("\u51FA\u5DEE\u6253\u5361");
		
		Composite composite_2 = new Composite(shell, SWT.NONE);
		composite_2.setBounds(157, 35, 275, 218);

	}
}
