package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora = em;
        Copiadora copiadora = em;
        Digitalizadora digitalizadora = em;

        impressora.imprimir();
        copiadora.copiar();
        digitalizadora.digitalizar();
    }
}
