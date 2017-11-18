/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.tecsup.springmvc.programa;

import java.util.List;
import pe.edu.tecsup.springmvc.model.Curso;
import pe.edu.tecsup.springmvc.model.Programa;

public interface ProgramaService {
  
  List <Programa> allPrograma();

    List<Curso> allCurso();

    Programa find(Long id);

    void save(Programa programa);

    void delete(Long id);

}
