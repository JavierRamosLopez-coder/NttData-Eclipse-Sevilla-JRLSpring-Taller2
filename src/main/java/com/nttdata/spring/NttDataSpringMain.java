package com.nttdata.spring;

import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.spring.persistence.NttDataSpringOrder;
import com.nttdata.spring.persistence.NttDataSpringProduct;
import com.nttdata.spring.services.NttDataSpringServices;

/**
 * 
 * Clase main - NttDataSpringMain
 * 
 * @author jramlope
 *
 */
@SpringBootApplication
public class NttDataSpringMain implements CommandLineRunner {

	Scanner S = new Scanner(System.in);

	/** Servicio NttDataSpringServicesOtherPlaces **/
	@Autowired
	@Qualifier("Others")
	private NttDataSpringServices otherplacesServices;

	/** Servicio NttDataSpringServicesPeninsula **/
	@Autowired
	@Qualifier("Peninsula")
	private NttDataSpringServices peninsulaServices;

	public static void main(String[] args) {
		SpringApplication.run(NttDataSpringMain.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Creación de un objeto de la clase NttDataSpringOrder
		NttDataSpringOrder order = new NttDataSpringOrder();

		// Creación de un objeto de la clase NttDataSpringProduct
		NttDataSpringProduct product = new NttDataSpringProduct();

		try {
			int indicator;
			System.out.println("<=== BIENVENIDOS ===>");
			System.out.println("Se procederá a añadir un pedido y el calculo del precio dependiendo del indicador");

			System.out.println("Introduzca el destinatario");
			String destinatary = S.nextLine();

			System.out.println("Introduzca la dirección de entrega");
			String addressDirection = S.nextLine();

			do {
				System.out.println("Introduzca el indicador");
				System.out.println("1. Peninsula");
				System.out.println("2. Ceuta");
				System.out.println("3. Melilla");
				System.out.println("4. Canarias");
				System.out.println("0. Salir");
				System.out.println();

				indicator = S.nextInt();

				order.setIdentifierNumber(1);
				order.setAddresse(destinatary);
				order.setDeliveryAddress(addressDirection);
				order.setDeliveryIdentifier(indicator);

				if (indicator == 1) {
					System.out.println("Bienvenido a la peninsula, vamos a añadir un producto");

					System.out.println("Introduzca el nombre del producto");
					String name = S.next();

					System.out.println("Introduzca el precio sin impuestos");
					Double priceWithOutTaxes = S.nextDouble();

					System.out.println("¿ Quiere calcular el precio con impuestos ?");
					System.out.println("1. Si");
					System.out.println("2. No");
					int opcion2 = S.nextInt();

					switch (opcion2) {
					case 1:
						System.out.println("El precio con impuestos es : "
								+ peninsulaServices.finalPvpOfProudct(priceWithOutTaxes));
						break;
					case 2:
						System.out.println("¡ VUELVA PRONTO !");
						break;
					}
				} else if (indicator == 2) {

					System.out.println("Bienvenido a la Ceuta, vamos a añadir un producto");

					System.out.println("Introduzca el nombre del producto");
					String name = S.next();

					System.out.println("Introduzca el precio sin impuestos");
					Double priceWithOutTaxes = S.nextDouble();

					System.out.println("¿ Quieres calcular el precio con impuestos");
					System.out.println("1. Si");
					System.out.println("2. No");
					int opcion3 = S.nextInt();

					switch (opcion3) {
					case 1:

						System.out.println("El precio con impuestos es : "
								+ otherplacesServices.finalPvpOfProudct(priceWithOutTaxes));

						break;
					case 2:

						System.out.println("¡ VUELVA PRONTO !");

						break;

					}

				} else if (indicator == 3) {

					System.out.println("Bienvenido a la Melilla, vamos a añadir un producto");

					System.out.println("Introduzca el nombre del producto");
					String name = S.next();

					System.out.println("Introduzca el precio sin impuestos");
					Double priceWithOutTaxes = S.nextDouble();

					System.out.println("¿ Quieres calcular el precio con impuestos");
					System.out.println("1. Si");
					System.out.println("2. No");
					int opcion3 = S.nextInt();

					switch (opcion3) {
					case 1:

						System.out.println("El precio con impuestos es : "
								+ otherplacesServices.finalPvpOfProudct(priceWithOutTaxes));

						break;
					case 2:

						System.out.println("¡ VUELVA PRONTO !");

						break;

					}

				} else if (indicator == 4) {
					System.out.println("Bienvenido a la Canarias, vamos a añadir un producto");

					System.out.println("Introduzca el nombre del producto");
					String name = S.next();

					System.out.println("Introduzca el precio sin impuestos");
					Double priceWithOutTaxes = S.nextDouble();

					System.out.println("¿ Quieres calcular el precio con impuestos");
					System.out.println("1. Si");
					System.out.println("2. No");
					int opcion3 = S.nextInt();

					switch (opcion3) {
					case 1:

						System.out.println("El precio con impuestos es : "
								+ otherplacesServices.finalPvpOfProudct(priceWithOutTaxes));

						break;
					case 2:

						System.out.println("¡ VUELVA PRONTO !");

						break;

					}
				} else if (indicator == 0) {

					System.out.println("¡ Vuelva pronto !");

				}
			} while (indicator != 0);
		} catch (Exception e) {

			System.out.println("Ha introducido un dato erróneo");

		}

	}

}
