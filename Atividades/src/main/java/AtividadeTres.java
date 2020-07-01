import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

import java.awt.*;

public class AtividadeTres {
    public static void main(String[] args){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(6.0, "Ciência", "Raul");
        dataset.addValue(4.0, "Matemática", "Raul");
        dataset.addValue(5.0, "Ciência", "Tauan");
        dataset.addValue(3.0, "Matemática", "Tauan");
        dataset.addValue(7.0, "Ciência", "Vinicius");
        dataset.addValue(8.0, "Matemática", "Vinicius");

        JFreeChart chart = ChartFactory.createLineChart(
                "Comparação entre estudantes e notas", "Estudantes", "Notas", dataset,
                PlotOrientation.VERTICAL, true, true, false);

        chart.setBackgroundPaint(Color.LIGHT_GRAY);

        chart.getTitle().setPaint(Color.blue); CategoryPlot p =
                chart.getCategoryPlot(); p.setForegroundAlpha(0.9f);

        p.setRangeGridlinePaint(Color.red);

        p.setDomainGridlinesVisible(true);

        p.setDomainGridlinePaint(Color.black); CategoryItemRenderer renderer =
                p.getRenderer(); renderer.setSeriesPaint(1, Color.red);

        renderer.setSeriesPaint(0, Color.green); ChartFrame frame1 = new
                ChartFrame("Tabela de notas", chart); frame1.setVisible(true);

        frame1.setSize(800, 600);
    }
}
