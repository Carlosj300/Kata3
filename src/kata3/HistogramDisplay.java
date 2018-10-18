package kata3;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author carlos
 */

class HistogramDisplay extends ApplicationFrame {
    
    public HistogramDisplay(){
        super("Histogram");
        this.setContentPane(CreatePanel());
        pack();
    }
    
    private JPanel CreatePanel(){
        ChartPanel chartPanel = new  ChartPanel(CreateChart(CreateDataSet()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        
        return chartPanel;
    }
    
    private JFreeChart CreateChart (DefaultCategoryDataset dataSet){
        JFreeChart chart;
        chart = ChartFactory.createBarChart("Histogram FreeChart",
                "Dominios de emails","Nº de emails", dataSet,PlotOrientation.VERTICAL,
                false,false,rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset CreateDataSet(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        
        dataSet.addValue(10, "", "ulpgc.es");
        dataSet.addValue(8, "", "gmail.es");
        dataSet.addValue(4, "", "ull.es");
        dataSet.addValue(7, "", "hotmail.es");
        
        return dataSet;
        
    }
    
    public void execute(){
        this.setVisible(true);
    }
}