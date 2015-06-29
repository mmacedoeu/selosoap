package br.com.valid.sicobe.endpoint;

import java.util.List;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.com.valid.sicobe.middleware.soap.Producao;
import br.com.valid.sicobe.middleware.soap.Selos;
import br.com.valid.sicobe.middleware.soap.SelosRequest;

@Endpoint
public class SeloSoapEndPoint {
	private static final String NAMESPACE_URI = "http://middleware.sicobe.valid.com.br/soap";

	public SeloSoapEndPoint() {
		// TODO Auto-generated constructor stub
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getSelo")
	@ResponsePayload
	public Selos getSelo(@RequestPayload SelosRequest request) {
		Selos output = new Selos();
		List<Producao> selos = output.getSelos();
		Producao prd = new Producao();
		prd.setCodigoProducao(123L);
		prd.setData("19/06/2015");
		prd.setSelo("0000258170");
		selos.add(prd);

		return output;
	}	

}
