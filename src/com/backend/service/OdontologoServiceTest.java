package com.backend.service;

import com.backend.dao.impl.OdontologoDaoH2;
import com.backend.entity.Odontologo;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoServiceTest {
    private OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());

    @Test
    public void deberiaAgregarUnOdontologo(){
        Odontologo odontologo = new Odontologo(5509, "Roberto", "Ballerno");

        Odontologo guardarOdontologoResult = odontologoService.guardarOdontologo(odontologo);

        assertEquals(5509, odontologo.getNumeroDeMatricula());
        assertNotNull(guardarOdontologoResult);
    }

    @Test
    public void deberiaListarTodosLosOdontologos(){
        List<Odontologo> odontologosTest = odontologoService.listarOdontologos();
        assertFalse(odontologosTest.isEmpty());
        assertTrue(odontologosTest.size() >= 3);
    }

}