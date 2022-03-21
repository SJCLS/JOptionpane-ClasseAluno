package poo.pkg02;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        String ra, nome;
        float ac1, ac2, ag, af;
        int opc = 0;
        Aluno aluno = null;
        Object[] op = {"Confirmar", "Cancelar"};
        while (opc != 3) {
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1-Criar aluno\n 2-Mostrar Aluno\n 3-Sair"));

            switch (opc) {
                case 1:

                    nome = JOptionPane.showInputDialog(null, "Informe seu nome: ");
                    ra = JOptionPane.showInputDialog(null, "Informe seu ra: ");
                    ac1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a nota da AC1: "));
                    ac2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a nota da AC2: "));
                    ag = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a nota da AG : "));
                    af = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a nota da AF : "));
                    aluno = new Aluno();
                    aluno.setNome(nome);
                    aluno.setRa(ra);
                    aluno.setAc1(ac1);
                    aluno.setAc2(ac2);
                    aluno.setAg(ag);
                    aluno.setAf(af);
                    break;
                case 2:
                    if (aluno != null) {
                        JOptionPane.showMessageDialog(null, aluno.imprimir());
                    } else {
                        JOptionPane.showMessageDialog(null, "Nenhum aluno Criado ", "Atenção", JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Até a proxima");

                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida", "Atenção", JOptionPane.WARNING_MESSAGE);
            }

        }
    }

}
