package edu.javacourse.contact.gui;

import edu.javacourse.contact.business.ContactManager;
import edu.javacourse.contact.entity.Contact;
import edu.javacourse.contact.exception.ContactBusinessException;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class ContactFrame extends JFrame implements ActionListener {
	private static final String FRAME = "frame";
	private static final String C_REFRESH = "refresh";
	private static final String C_ADD = "add";
	private static final String C_UPDATE = "update";
	private static final String C_DELETE = "delete";

	private static final String LOAD = "LOAD";
	private static final String ADD = "ADD";
	private static final String EDIT = "EDIT";
	private static final String DELETE = "DELETE";

	private final ContactManager contactManager = new ContactManager();
	private final JTable contactTable = new JTable();

	// � ������������ �� ������� ������ ��������
	public ContactFrame() {
		// ���������� � ������� ��������, ������� ��������� ��������
		// ������ ���� ������ � �������
		contactTable.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);

		// ���������� layout GridBagLayout
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		// ������ ������� �������� ��������� � ������
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		// ������� ������������ �� ���� ������ ������
		gbc.fill = GridBagConstraints.BOTH;
		// �� ����� ������� - �����, ������ � ������ �� 5. ����� - 0
		gbc.insets = new Insets(5, 5, 0, 5);

		// ������� ������ ��� ������
		JPanel btnPanel = new JPanel();
		// ������������ � ���� layout
		btnPanel.setLayout(gridbag);
		// ������� ������ � ��������� �� �������� � ActionCommand
		btnPanel.add(createButton(gridbag, gbc, GuiResource.getLabel(FRAME, C_REFRESH), LOAD));
		btnPanel.add(createButton(gridbag, gbc, GuiResource.getLabel(FRAME, C_ADD), ADD));
		btnPanel.add(createButton(gridbag, gbc, GuiResource.getLabel(FRAME, C_UPDATE), EDIT));
		btnPanel.add(createButton(gridbag, gbc, GuiResource.getLabel(FRAME, C_DELETE), DELETE));

		// ������� ������ ��� ����� ������� � ��������
		JPanel left = new JPanel();
		// ���������� layout BorderLayout
		left.setLayout(new BorderLayout());
		// ������ ������ � �������� � ������� �����
		left.add(btnPanel, BorderLayout.NORTH);
		// ������ ������ ��� ����� ������� �� ����� ����� - WEST
		add(left, BorderLayout.WEST);

		// ������ ������ �� ����������, ������ ������� �������� ���� �������
		// ������ ������� ����� ���������������
		add(new JScrollPane(contactTable), BorderLayout.CENTER);

		// ���������� ���������� �����
		setBounds(100, 200, 900, 400);
		// ��� �������� ����� ����������� ������ ����������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ��������� ��������
		try {
			loadContact();
		} catch (ContactBusinessException ex) {
			ex.printStackTrace();
		}
	}

	// ����� ������� ������ � ��������� ��������������� - ��������� � ��������
	private JButton createButton(GridBagLayout gridbag, GridBagConstraints gbc, String title, String action) {
		// ������� ������ � �������� ���������
		JButton button = new JButton(title);
		// �������� ������ ���������� � ����������� � �� ����� �����, �����
		// ������ ������ ������
		button.setActionCommand(action);
		// ������������ ������� �� ������ �������� ���� �����
		button.addActionListener(this);
		// ���������� �������� ��� ���������� ��� ������
		gridbag.setConstraints(button, gbc);
		return button;
	}

	@Override
	// ��������� ������� ������
	public void actionPerformed(ActionEvent ae) {
		// �������� ������� - ActionCommand
		String action = ae.getActionCommand();
		// � ����������� �� ������� ��������� ��������
		try {
			switch (action) {
			// ���������� ������
			case LOAD:
				loadContact();
				break;
			// ���������� ������
			case ADD:
				addContact();
				break;
			// ����������� ������
			case EDIT:
				editContact();
				break;
			// �������� ������
			case DELETE:
				deleteContact();
				break;
			}
		} catch (ContactBusinessException ex) {
			// ����� ������� ������ �������� ���������
			JOptionPane.showMessageDialog(this, ex.getMessage());
		}
	}

	// ��������� ������ ���������
	private void loadContact() throws ContactBusinessException {
		// ���������� � ������ ��� �������� ������ ���������
		List<Contact> contacts = contactManager.findContacts();
		// ������� ������, ������� �������� ���������� ������
		ContactModel cm = new ContactModel(contacts);
		// �������� ���� ������ ������� - � ��� ����� �� ����������
		contactTable.setModel(cm);
	}

	// ���������� ��������
	private void addContact() throws ContactBusinessException {
		// ������� ������ ��� ����� ������
		EditContactDialog ecd = new EditContactDialog();
		// ������������ �������� �������
		saveContact(ecd);
	}

	// �������������� ��������
	private void editContact() throws ContactBusinessException {
		// �������� ���������� ������
		int sr = contactTable.getSelectedRow();
		// ���� ������ �������� - ����� �� �������������
		if (sr != -1) {
			// �������� ID ��������
			Long id = Long.parseLong(contactTable.getModel().getValueAt(sr, 0).toString());
			// �������� ������ �������� �� ��� ID
			Contact cnt = contactManager.getContact(id);
			// ������� ������ ��� ����� ������ � �������� ���� �������
			EditContactDialog ecd = new EditContactDialog(contactManager.getContact(id));
			// ������������ �������� �������
			saveContact(ecd);
		} else {
			// ���� ������ �� �������� - �������� �� ����
			JOptionPane.showMessageDialog(this, "�� ������ �������� ������ ��� ��������������");
		}
	}

	// �������� ��������
	private void deleteContact() throws ContactBusinessException {
		// �������� ���������� ������
		int sr = contactTable.getSelectedRow();
		if (sr != -1) {
			// �������� ID ��������
			Long id = Long.parseLong(contactTable.getModel().getValueAt(sr, 0).toString());
			// ������� �������
			contactManager.deleteContact(id);
			// ����������� ������ ���������
			loadContact();
		} else {
			JOptionPane.showMessageDialog(this, "�� ������ �������� ������ ��� ��������");
		}
	}

	// ����� ����� ��� ���������� � ��������� ��������
	private void saveContact(EditContactDialog ecd) throws ContactBusinessException {
		// ���� �� ������ ������ SAVE
		if (ecd.isSave()) {
			// �������� ������� �� ����������� ����
			Contact cnt = ecd.getContact();
			if (cnt.getContactId() != null) {
				// ���� ID � �������� ����, �� �� ��� ���������
				contactManager.updateContact(cnt);
			} else {
				// ���� � �������� ��� ID - ������ �� ����� � �� ��� ���������
				contactManager.addContact(cnt);
			}
			loadContact();
		}
	}
}