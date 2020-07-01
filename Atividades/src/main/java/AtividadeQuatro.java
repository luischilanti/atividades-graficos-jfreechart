import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

import java.awt.*;

public class AtividadeQuatro {
    public static void main(String[] args){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(6.0, "Luís", "Português");
        dataset.addValue(9.0, "Luís", "Matemática");
        dataset.addValue(5.0, "Luís", "História");
        dataset.addValue(3.0, "Luís", "Geografia");
        dataset.addValue(5.0, "Luís", "Química");
        dataset.addValue(8.0, "Luís", "Biologia");
        dataset.addValue(7.0, "Luís", "Física");
        dataset.addValue(8.0, "Luís", "Inglês");


        JFreeChart chart = ChartFactory.createLineChart(
                "Comparação entre estudantes e notas", "Matérias", "Nota", dataset,
                PlotOrientation.VERTICAL, true, true, false);

        chart.setBackgroundPaint(Color.LIGHT_GRAY);

        chart.getTitle().setPaint(Color.blue); CategoryPlot p =
                chart.getCategoryPlot(); p.setForegroundAlpha(0.9f);

        p.setRangeGridlinePaint(Color.red);

        p.setDomainGridlinesVisible(true);

        p.setDomainGridlinePaint(Color.gray); CategoryItemRenderer renderer =
                p.getRenderer(); renderer.setSeriesPaint(1, Color.red);

        renderer.setSeriesPaint(0, Color.black); ChartFrame frame1 = new
                ChartFrame("Tabela de notas", chart); frame1.setVisible(true);

        frame1.setSize(800, 600);
    }
}
