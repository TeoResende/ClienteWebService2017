package br.com.senai.clientewebservice2017;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

public class WS {

    public boolean enviarWS(String t) throws IOException, XmlPullParserException {
        SoapObject SOAP = new SoapObject("http://webservice","setTexto");
        SOAP.addProperty("t",t);
        SoapSerializationEnvelope envelope =
                    new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(SOAP);
        HttpTransportSE http =
                new HttpTransportSE("http://189.91.101.54:8080/TrocaMsgWebService/services/WS?wsdl");
        http.call("setTexto",envelope);
        return true;
    }

    public boolean receberWS(){
        SoapObject SOAP = new SoapObject("http://webservice","getTexto");

        return true;
    }
}