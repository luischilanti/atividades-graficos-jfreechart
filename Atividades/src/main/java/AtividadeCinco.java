import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

import java.awt.*;

public class AtividadeCinco {
    public static void main(String[] args){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Luís", "Programação Web I");
        dataset.addValue(9.0, "Luís", "Programação II");
        dataset.addValue(10.0, "Luís", "Gerenciamento de Redes");
        dataset.addValue(9.0, "Luís", "Projetos");


        JFreeChart chart = ChartFactory.createLineChart(
                "Tabela de notas", "Matérias", "Notas", dataset,
                PlotOrientation.VERTICAL, true, true, false);

        chart.setBackgroundPaint(Color.lightGray);

        chart.getTitle().setPaint(Color.blue); CategoryPlot p =
                chart.getCategoryPlot(); p.setForegroundAlpha(0.9f);

        p.setRangeGridlinePaint(Color.red);

        p.setDomainGridlinesVisible(true);

        p.setDomainGridlinePaint(Color.black); CategoryItemRenderer renderer =
                p.getRenderer(); renderer.setSeriesPaint(1, Color.red);

        renderer.setSeriesPaint(0, Color.black); ChartFrame frame1 = new
                ChartFrame("Tabela de notas", chart); frame1.setVisible(true);

        frame1.setSize(900, 600);
    }
}
