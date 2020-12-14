package com.company;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.lang.reflect.Method;

@Test
public class TestNG {


    ///////////////////////////////////////////////////////////////////////////////////////////////////
    //                                   BEFORE & AFTER                                              //
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // BeforeMethod - Executa código antes de cada teste                                             //
    // AfterMethod  - Executa código depois de cada teste                                            //
    // BeforeClass  - Executa código antes de todos os casos de teste                                //
    // AfterClass   - Executa código depois de todos os casos de teste                               //
    // BeforeMethod - Executa código antes de cada teste                                             //
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @BeforeMethod
    public void beforeTest(Method method){ System.out.println("A correr o teste: " + method.getName()); }

    @AfterMethod
    public void afterTest(ITestResult result){ System.out.println("Teste " + result.getName() + " com o resultado: " + ((result.getStatus() == 1) ? "passou" : "falhou") + "\n"); }

    @BeforeClass
    public void beforeClass(){ System.out.println("----Código executado antes dos testes----\n"); }

    @AfterClass
    public void afterClass(){ System.out.println("\n----Código executado após os testes----"); }


    ///////////////////////////////////////////////////////////////////////////////////////////////////
    ///                                     TESTES                                                  ///
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Test
    public void exemploPass(){
        Assert.assertEquals(Methods.example("Alexandre"), "Alexandre");
    }

    @Test
    public void exemploFail(){
        Assert.assertNotEquals(Methods.example("Alexandre"), "Antonio");
    }
}

//Respostas: https://www.youtube.com/watch?v=dQw4w9WgXcQ