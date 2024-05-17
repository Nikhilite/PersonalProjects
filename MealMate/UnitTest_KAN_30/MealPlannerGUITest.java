package codeFiles;

import org.junit.jupiter.api.Test;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import static org.junit.jupiter.api.Assertions.*;

public class MealPlannerGUITest {

    @Test
    public void testTableCreation() {
        MealPlannerGUI mealPlannerGUI = new MealPlannerGUI();

        // Get the content pane of the GUI
        JScrollPane scrollPane = (JScrollPane) mealPlannerGUI.getContentPane().getComponent(0);

        // Verify that the content pane contains a JScrollPane
        assertNotNull(scrollPane);

        // Get the JTable from the JScrollPane
        JTable mealTable = (JTable) scrollPane.getViewport().getView();

        // Verify that the JTable is not null
        assertNotNull(mealTable);

        // Verify that the JTable has the correct number of rows and columns
        DefaultTableModel tableModel = (DefaultTableModel) mealTable.getModel();
        assertEquals(24, tableModel.getRowCount()); // 24 rows for 24 hours
        assertEquals(8, tableModel.getColumnCount()); // 8 columns for days of the week
    }

    @Test
    public void testTableCellsNotEditable() {
        MealPlannerGUI mealPlannerGUI = new MealPlannerGUI();

        // Get the content pane of the GUI
        JScrollPane scrollPane = (JScrollPane) mealPlannerGUI.getContentPane().getComponent(0);

        // Get the JTable from the JScrollPane
        JTable mealTable = (JTable) scrollPane.getViewport().getView();

        // Verify that all cells in the JTable are not editable
        for (int row = 0; row < mealTable.getRowCount(); row++) {
            for (int col = 0; col < mealTable.getColumnCount(); col++) {
                assertFalse(mealTable.isCellEditable(row, col));
            }
        }
    }

    @Test
    public void testColumnWidth() {
        MealPlannerGUI mealPlannerGUI = new MealPlannerGUI();

        // Get the content pane of the GUI
        JScrollPane scrollPane = (JScrollPane) mealPlannerGUI.getContentPane().getComponent(0);

        // Get the JTable from the JScrollPane
        JTable mealTable = (JTable) scrollPane.getViewport().getView();

        // Verify that the width of the first column ("Time") is set to a preferred width
        assertEquals(70, mealTable.getColumnModel().getColumn(0).getPreferredWidth());
    }
}

