package lista2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class executora {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        ArrayList<aluno> alunos = new ArrayList<aluno>();

        int opcao = 0;

        do {
            System.out.println("------ LISTA 2 ------");
            System.out.println("1 - Adicionar aluno");
            System.out.println("2 - Remover aluno");
            System.out.println("3 - Atualizar aluno");
            System.out.println("4 - Buscar aluno");
            System.out.println("5 - Listar alunos");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção:");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: 
                    System.out.println("Digite o nome do aluno: ");
                    String nome = scanner.next(); 
                    System.out.println("Digite a matricula do aluno: ");
                    int matricula = scanner.nextInt();
                    aluno aluno = new aluno(nome, matricula);
                    alunos.add(aluno);
                    System.out.println("Aluno Cadastrado");
                    break;

                case 2: 
                    System.out.println("Digite a matrícula do aluno a ser excluído do sistema: ");

                    int matriculaExcluida = scanner.nextInt();
                    aluno alunoExcluir = null;

                    for (aluno a : alunos) {
                        if (a.getMatricula() == matriculaExcluida) {
                            alunoExcluir = a;
                            break;
                        }
                    }

                    if (alunoExcluir != null) {
                        alunos.remove(alunoExcluir);
                        System.out.println("Aluno excluido!");
                    } else {
                        System.out.println("Aluno não encontrado!");
                    }
                    break;

                case 3: 
                    System.out.println("Digite a matrícula que deseja fazer ajustes: ");

                    int matriculaAtualizada = scanner.nextInt();
                    aluno alunoAtualizar = null;

                    for (aluno a : alunos) {
                        if (a.getMatricula() == matriculaAtualizada) {
                            alunoAtualizar = a;
                            break;
                        }
                    }

                    if (alunoAtualizar != null) {
                        System.out.println("Digite o novo nome do aluno: ");
                        String nomeNovo = scanner.next();
                        System.out.println("Digite a nova matrícula: ");
                        int matriculaNova = scanner.nextInt();
                        alunoAtualizar.setNome(nomeNovo);
                        alunoAtualizar.setMatricula(matriculaNova);
                        System.out.println("Matricula Atualizada com sucesso");
                    } else {
                        System.out.println("Matrícula não encontrada");
                    }
                    break;

                case 4: 
                    System.out.println("Digite a matricula que está procurando: ");
                    int buscaMatricula = scanner.nextInt();
                    aluno buscaAluno = null;

                    for (aluno a : alunos) {
                        if (a.getMatricula() == buscaMatricula) {
                            buscaAluno = a;
                            break;
                        }
                    }

                    if (buscaAluno != null) {
                        System.out.println("Aluno encontrado: "
                                + buscaAluno.getNome() + "-" + buscaAluno.getMatricula());
                    } else {
                        System.out.println("Aluno não encontrado!");
                    }
                    break;
                case 5:
                    System.out.println("Alunos: ");
                    for (aluno a : alunos) {
                        System.out.println(a.getNome() + " - " + a.getMatricula());
                    }
                    break;
                case 0:
                    System.out.println("Fechando código... ");
                    break;
                default:
                    break;
            }

        } while (opcao != 0);
    }
}