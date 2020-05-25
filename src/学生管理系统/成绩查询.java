package 学生管理系统;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;

public class 成绩查询 {

	protected Shell shell;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			成绩查询 window = new 成绩查询();
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
		shell.setText("\u6210\u7EE9\u67E5\u8BE2");
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(56, 20, 76, 20);
		lblNewLabel.setText("\u59D3\u540D");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(189, 20, 73, 26);
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBounds(56, 71, 76, 20);
		lblNewLabel_1.setText("\u5B66\u53F7");
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(189, 71, 73, 26);
		
		Label lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setBounds(56, 128, 76, 20);
		lblNewLabel_2.setText("\u603B\u5206");
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setBounds(189, 128, 73, 26);
		
		Label lblNewLabel_3 = new Label(shell, SWT.NONE);
		lblNewLabel_3.setBounds(56, 182, 76, 20);
		lblNewLabel_3.setText("\u6392\u540D");
		
		text_3 = new Text(shell, SWT.BORDER);
		text_3.setBounds(189, 176, 73, 26);
		
		Button button = new Button(shell, SWT.NONE);
		button.setBounds(147, 213, 98, 30);
		button.setText("\u8FD4\u56DE");
		button.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e) {
				主菜单 search=new 主菜单();
				shell.close();
				search.open();
			}
		});
	}

}
