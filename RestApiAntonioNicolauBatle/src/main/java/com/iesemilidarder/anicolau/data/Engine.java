package com.iesemilidarder.anicolau.data;

public abstract class Engine {
    protected String ServiceType;
    protected Engine(String ServiceType) {
        this.ServiceType = ServiceType;
    }

//El Motor Muestra Servicios
//El Motor Agrega Nuevos Servicios
//El Motor Muestra Países
//El Motor Muestra Otras Utilidades
//Motor == Engine Nacele

public abstract void mostrarserv();
public String getServiceType(){
    return ServiceType;

}

public void setServiceType(String ServiceType) {
    this.ServiceType = ServiceType;
}

public String toString() {
    return "Este es el Servicio:"+this.ServiceType;
}





//aqui cierro la clase Engine(Motor)
}
/**************** */
