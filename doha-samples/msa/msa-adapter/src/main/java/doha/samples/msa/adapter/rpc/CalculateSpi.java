package doha.samples.msa.adapter.rpc;

import org.springframework.stereotype.Component;

import com.dinstone.focus.annotation.ServiceReference;
import doha.samples.msa.port.remote.CalculateRemote;
import doha.samples.msb.api.rpc.ArithRequest;
import doha.samples.msb.api.rpc.ArithService;

@Component
public class CalculateSpi implements CalculateRemote {

    @ServiceReference
    private ArithService arithService;

    @Override
    public double add(double a, double b) {
        return arithService.Add(ArithRequest.newBuilder().setA(a).setB(b).build()).getC();
    }

    @Override
    public double sub(double a, double b) {
        return arithService.Add(ArithRequest.newBuilder().setA(a).setB(b).build()).getC();
    }

    @Override
    public double mul(double a, double b) {
        return arithService.Add(ArithRequest.newBuilder().setA(a).setB(b).build()).getC();
    }

    @Override
    public double div(double a, double b) {
        return arithService.Add(ArithRequest.newBuilder().setA(a).setB(b).build()).getC();
    }
}
