package 学生管理系统;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class 注册 {

	protected Shell shell;
	private Text text;
	private Text text_1;
	private Text text_2;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			注册 window = new 注册();
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
		shell.setText("\u6CE8\u518C\u754C\u9762");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton.setBounds(133, 160, 98, 30);
		btnNewButton.setText("\u6CE8\u518C");
		
		Label label_1 = new Label(shell, SWT.NONE);
		label_1.setBounds(50, 31, 76, 20);
		label_1.setText("\u8D26\u53F7");
		
		Label label = new Label(shell, SWT.NONE);
		label.setBounds(50, 72, 76, 20);
		label.setText("\u5BC6\u7801");
		
		Label label_2 = new Label(shell, SWT.NONE);
		label_2.setBounds(50, 116, 76, 20);
		label_2.setText("\u786E\u8BA4\u5BC6\u7801");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(133, 25, 181, 26);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(132, 72, 182, 26);
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setBounds(132, 116, 181, 26);
		
		Button button = new Button(shell, SWT.NONE);
		button.setBounds(133, 196, 98, 30);
		button.setText("\u53D6\u6D88");
		button.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e) {
				主菜单 search=new 主菜单();
				shell.close();
				search.open();
			}
		});
	}

}
