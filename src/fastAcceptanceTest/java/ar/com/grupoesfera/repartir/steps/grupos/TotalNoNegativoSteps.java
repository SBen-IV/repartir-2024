package ar.com.grupoesfera.repartir.steps.grupos;

import ar.com.grupoesfera.repartir.model.Grupo;
import ar.com.grupoesfera.repartir.steps.FastCucumberSteps;
import io.cucumber.java.PendingException;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TotalNoNegativoSteps extends FastCucumberSteps {

    private Grupo grupo;

//    @Cuando("el usuario intenta crear un grupo indicando un único miembro")
//    public void elUsuarioIntentaCrearUnGrupoIndicandoUnUnicoMiembro() {
//
//        List<String> miembros = new LinkedList<String>();
//        miembros.add( "Oscar" );
//
//        grupo = new Grupo();
//
//        grupo.setMiembros( miembros );
//    }
//
//    @Entonces("no debería crear el grupo con un único miembro")
//    public void noDeberiaCrearElGrupoConUnUnicoMiembro() {
//
//        assertThat( this.grupo.estaFormado() ).isFalse();
//    }

    @Dado("existe un grupo con monto total $ {string}")
    public void existeUnGrupoConMontoTotal$(int monto) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
        // Create a new group
    }

    @Cuando("el usuario agrega un monto de $ {string}")
    public void elUsuarioAgregaUnMontoDe$(int monto) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
        // Add new monto
    }

    @Entonces("el nuevo monto debería ser $ {string}")
    public void elNuevoMontoDeberiaSer$(int monto) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
        // Check the new monto
    }
}
