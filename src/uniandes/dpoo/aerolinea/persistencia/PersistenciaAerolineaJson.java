package uniandes.dpoo.aerolinea.persistencia;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;

import org.json.JSONArray;
import org.json.JSONObject;

import uniandes.dpoo.aerolinea.exceptions.ClienteRepetidoException;
import uniandes.dpoo.aerolinea.exceptions.InformacionInconsistenteException;
import uniandes.dpoo.aerolinea.exceptions.InformacionInconsistenteTiqueteException;
import uniandes.dpoo.aerolinea.modelo.Aerolinea;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.cliente.ClienteCorporativo;
import uniandes.dpoo.aerolinea.modelo.cliente.ClienteNatural;
import uniandes.dpoo.aerolinea.tiquetes.GeneradorTiquetes;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class PersistenciaAerolineaJson implements IPersistenciaAerolinea{

	
	
	@Override
    public void cargarAerolinea(String archivo, Aerolinea aerolinea) 
    		throws IOException, InformacionInconsistenteException {
		
        String jsonCompleto = new String(Files.readAllBytes(new File(archivo).toPath()));
        JSONObject raiz = new JSONObject(jsonCompleto);

        //cargarAviones( aerolinea, raiz.getJSONArray( "aviones" ) );
        //cargarAeropuertos( aerolinea, raiz.getJSONArray( "aeropuertos" ) );
        //cargarRutas( aerolinea, raiz.getJSONArray( "rutas" ) );
        //cargarVuelos( aerolinea, raiz.getJSONArray( "vuelos" ) );
    }



	@Override
    public void salvarAerolinea(String archivo, Aerolinea aerolinea) throws IOException {
    
    
        JSONObject jobject = new JSONObject();
        
        //salvarAerolinea(aerolinea, jobject);
        
        PrintWriter pw = new PrintWriter(archivo);
        jobject.write(pw, 2, 0);
        pw.close();
        
    }

}
