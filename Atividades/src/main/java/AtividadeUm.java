import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

import java.awt.*;

public class AtividadeUm {
    public static void main(String[] args){
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.addValue(4.0, "Science", "Rahul");
            dataset.addValue(3.0, "Maths", "Rahul");
            dataset.addValue(5.0, "Science", "Vinod");
            dataset.addValue(2.0, "Maths", "Vinod");
            dataset.addValue(3.0, "Science", "Prashant");
            dataset.addValue(5.0, "Maths", "Prashant");
            dataset.addValue(6.0, "Science", "Tapan");
            dataset.addValue(2.0, "Maths", "Tapan");
            dataset.addValue(3.0, "Science", "Santosh");
            dataset.addValue(5.0, "Maths", "Santosh");

            JFreeChart chart = ChartFactory.createLineChart(
                    "Comparison between Students Mark", "Students", "Marks", dataset,
                    PlotOrientation.VERTICAL, true, true, false);

            chart.setBackgroundPaint(Color.LIGHT_GRAY);

            chart.getTitle().setPaint(Color.blue); CategoryPlot p =
                    chart.getCategoryPlot(); p.setForegroundAlpha(0.9f);

            p.setRangeGridlinePaint(Color.red);

            p.setDomainGridlinesVisible(true);

            p.setDomainGridlinePaint(Color.black); CategoryItemRenderer renderer =
                    p.getRenderer(); renderer.setSeriesPaint(1, Color.red);

            renderer.setSeriesPaint(0, Color.green); ChartFrame frame1 = new
                    ChartFrame("Area Chart", chart); frame1.setVisible(true);

            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            frame1.setSize(screenSize.width, screenSize.height);
    }
}
