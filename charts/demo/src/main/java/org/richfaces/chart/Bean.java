package org.richfaces.chart;

import java.io.Serializable;
import javax.annotation.PostConstruct;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.richfaces.sandbox.chart.model.ChartDataModel;
import org.richfaces.sandbox.chart.model.NumberChartDataModel;
import org.richfaces.sandbox.chart.model.StringChartDataModel;


@ManagedBean(name = "bean")
@RequestScoped
public class Bean implements Serializable {
    
    NumberChartDataModel a;
    NumberChartDataModel b;
    NumberChartDataModel c;
    NumberChartDataModel barModel;
    
    StringChartDataModel pie;
    StringChartDataModel category;
    StringChartDataModel category2;
    
    
    
    
    @PostConstruct
    public void init(){
        a = new NumberChartDataModel(ChartDataModel.ChartType.line);
        a.put(1, 8);
        a.put(2, 12);
        a.put(3, 13);
        a.put(4, 14);
        a.put(5, 16);
        a.put(6, 18);
        a.put(7, 15);
        a.put(8, 20);
        a.put(9, 21);
        a.put(10, 15);
        a.put(12, 16);
        a.put(13, 18);
        a.put(14, 20);
        
        
        
        b = new NumberChartDataModel(ChartDataModel.ChartType.line);
        b.put(2, 6);
        b.put(3, 10);
        b.put(4, 11);
        b.put(5, 12);
        b.put(6, 15);
        b.put(7, 16);
        b.put(8, 14);
        b.put(9, 14);
        b.put(10, 14);
    
        barModel = new NumberChartDataModel(ChartDataModel.ChartType.bar);
        barModel.put(2,3);
        barModel.put(4,6);
        barModel.put(5,4);
        barModel.put(6,7);
        
        c = new NumberChartDataModel(ChartDataModel.ChartType.line);
        c.put(2, 6);
        c.put(3, 8);
        c.put(5, 4);
        c.put(10, 6);
        c.put(15, 8);
        c.put(14, 4);
    
        
        pie = new StringChartDataModel(ChartDataModel.ChartType.pie);
        pie.put("a", 3);
        pie.put("b", 4);
        pie.put("c", 5);
        
        category = new StringChartDataModel(ChartDataModel.ChartType.bar);
        category.put("A", 1);
        category.put("B", 2);
        category.put("C", 3);
        
        category2 = new StringChartDataModel(ChartDataModel.ChartType.bar);
        category2.put("A", 1);
        category2.put("B", 2);
        category2.put("C", 3);
        
    }

    public NumberChartDataModel getA() {
        return a;
    }

    public NumberChartDataModel getB() {
        return b;
    }

    public NumberChartDataModel getC() {
        return c;
    }

    public StringChartDataModel getCategory() {
        return category;
    }

    public StringChartDataModel getCategory2() {
        return category2;
    }

    

    public NumberChartDataModel getBarModel() {
        return barModel;
    }

    public StringChartDataModel getPie() {
        return pie;
    }
    
    
    
    
    
    
    

}