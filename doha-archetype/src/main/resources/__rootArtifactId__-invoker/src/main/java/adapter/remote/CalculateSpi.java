#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.adapter.remote;

import org.springframework.stereotype.Component;

import ${package}.port.remote.CalculateRemote;

@Component
public class CalculateSpi implements CalculateRemote {

//    @ServiceReference
//    private ArithService arithService;

    @Override
    public double add(double a, double b) {
        return 0;
//        return arithService.Add(ArithRequest.newBuilder().setA(a).setB(b).build()).getC();
    }

    @Override
    public double sub(double a, double b) {
        return 0;
//        return arithService.Add(ArithRequest.newBuilder().setA(a).setB(b).build()).getC();
    }

    @Override
    public double mul(double a, double b) {
        return 0;
//        return arithService.Add(ArithRequest.newBuilder().setA(a).setB(b).build()).getC();
    }

    @Override
    public double div(double a, double b) {
        return 0;
//        return arithService.Add(ArithRequest.newBuilder().setA(a).setB(b).build()).getC();
    }
}
