import static java.lang.System.*;
import java.util.Scanner;
import java.io.*;

public class menu
{
	static BloomFilter bm = new BloomFilter((int)1e6, 6);
	static Library lib;
	static Scanner in = new Scanner(System.in);

	public static void display_menu(String[] opts) 
	{
    	for (int i=0; i<opts.length; i++) 
    	{
        	out.println("["+(i+1)+"] - "+opts[i]);
    	}

    	out.println("[0] - Anterior");
	}

	public static void main(String[] args) throws IOException
	{
		String[] menu1 = {"Listar Livros", "Pesquisar Livros", "Pesquisar autores", "Admistração"};
		String[] listar = {"Listar todos os livros", "Listar livros por categoria"};
		String[] pesquisar = {"Verificar existncia de livro", "Listar livros com titulos parecidos"};
		String[] pesquisar1 = {"Verificar se há livros do autor", "Listar livros do autor"};
		String[] admin = {"Adicionar livro", "Remover livro", "Requisitar livro"};
		boolean mainMenu = false;

		try 
		{
			lib = new Library("MPEI Library");
		} 
		catch(FileNotFoundException e) 
		{}

		do {
			mainMenu = false;
			display_menu(menu1);

			System.out.print("Selecione uma opção:");

			switch(in.nextInt())
			{
				case 0:
					break;

				case 1:

					out.println("");
					display_menu(listar);
					out.print("Selcione uma opção:");

					switch(in.nextInt())
					{
						case 0:

							mainMenu = true;
							out.println("");
							break;

						case 1:

							break;

						case 2:

							break;

					}
					break;

				case 2:

					out.println("");
					display_menu(pesquisar);
					out.print("Selecione uma opção:");

					switch(in.nextInt())
					{
						case 0:

							mainMenu = true;
							out.println("");
							break;

						case 1:

							break;

						case 2:

							break;
					}
					
					break;

				case 3:

					out.println("");
					display_menu(pesquisar1);
					out.print("Selecione uma opção:");

					switch(in.nextInt())
					{
						case 0:

							mainMenu = true;
							out.println("");
							break;

						case 1:

							break;

						case 2:

							break;
					}
					
					break;

				case 4:

					out.println("");
					display_menu(admin);
					out.print("Selecione uma opção:");

					switch(in.nextInt())
					{
						case 0:

							mainMenu = true;
							out.println("");
							break;

						case 1:

							break;

						case 2:

							break;

						case 3:

							break;

					}
					
					break;
			}
		} while(mainMenu);
	}
}