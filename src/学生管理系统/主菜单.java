package ѧ������ϵͳ;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.*;
import org.eclipse.swt.widgets.*;
public class ���˵� {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			���˵� window = new ���˵�();
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
		shell.setText("\u4E3B\u83DC\u5355");
		
		Button button = new Button(shell, SWT.NONE);
		button.setBounds(153, 50, 98, 30);
		button.setText("\u6CE8\u518C");
		button.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e) {
				ע�� regist=new ע��();
				shell.close();
				regist.open();
			}
		});
		Button button_1 = new Button(shell, SWT.NONE);
		button_1.setBounds(153, 142, 98, 30);
		button_1.setText("\u6210\u7EE9\u67E5\u8BE2");
		button_1.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e) {
				�ɼ���ѯ search=new �ɼ���ѯ();
				shell.close();
				search.open();
			}
		});
	}

}
