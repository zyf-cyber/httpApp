package 学生管理系统;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.*;
import org.eclipse.swt.widgets.*;
public class 登录界面 {

	protected Shell shell;
	private Text text;
	private Text text_1;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			登录界面 window = new 登录界面();
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
		shell.setText("\u767B\u5F55");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (text.getText()!= ""||text_1.getText() != "") {
					MessageDialog.openInformation(shell, "登陆信息",
							"欢迎" + text.getText() + "进入系统");
					主菜单 menu=new 主菜单();
					shell.close();
					menu.open();
				} else {
					MessageDialog.openError(shell, "错误", "用户名密码为空，请重新输入");
				}
			}
		});
		btnNewButton.setBounds(147, 122, 98, 30);
		btnNewButton.setText("\u767B\u5F55");
		
		final Button btnNewButton_1 = new Button(shell, SWT.ABORT);
		btnNewButton_1.setBounds(147, 184, 98, 30);
		btnNewButton_1.setText("\u9000\u51FA");
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(final SelectionEvent e) {
				shell.close();
			}
		});
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(48, 23, 76, 20);
		lblNewLabel.setText("\u8D26\u53F7");
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBounds(48, 78, 76, 20);
		lblNewLabel_1.setText("\u5BC6\u7801");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(147, 23, 186, 26);
		
		text_1 = new Text(shell,SWT.BORDER | SWT.PASSWORD);
		text_1.setBounds(147, 72, 186, 26);

	}
}