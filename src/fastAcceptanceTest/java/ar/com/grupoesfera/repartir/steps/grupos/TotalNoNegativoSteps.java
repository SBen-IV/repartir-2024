package ar.com.grupoesfera.repartir.steps.grupos;

import ar.com.grupoesfera.repartir.model.Grupo;
import ar.com.grupoesfera.repartir.steps.FastCucumberSteps;
import io.cucumber.java.PendingException;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TotalNoNegativoSteps extends FastCucumberSteps {

    private Grupo grupo;

    @Dado("existe un grupo con monto total $ {bigdecimal}")
    public void existeUnGrupoConMontoTotal$(BigDecimal monto) {
        // Create a new group
        Grupo grupo = new Grupo();
        grupo.setNombre("Fiesta de disfraces");
        List<String> miembros = new LinkedList<String>();
        miembros.add( "Oscar" );
        miembros.add( "Luis" );
        grupo.setMiembros(miembros);
        grupo.setTotal(monto);

        assertThat(grupo.estaFormado()).isTrue();

        this.grupo = grupo;
    }

    @Cuando("el usuario agrega un monto de $ {bigdecimal}")
    public void elUsuarioAgregaUnMontoDe$(BigDecimal monto) {
        // Add new monto
        BigDecimal totalActual = this.grupo.getTotal();
        BigDecimal total = totalActual.add(monto);
        this.grupo.setTotal(total);
    }

    @Entonces("el nuevo monto debería ser $ {bigdecimal}")
    public void elNuevoMontoDeberiaSer$(BigDecimal monto) {
        // Check the new monto
        BigDecimal nuevoTotal = this.grupo.getTotal();

        assertThat(nuevoTotal.compareTo(monto)).isZero();
    }
}
