package org.courtine.easy.temperatures;

import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author <a href="mailto:benoit.courtine@gmail.com">Benoît Courtine</a>
 */
public class SolutionTest {

  @Test
  public void donnees_simples() throws IOException {
    test("/easy/temperatures/simple.txt", 1);
  }

  @Test
  public void uniquement_des_nombres_negatifs() throws IOException {
    test("/easy/temperatures/negatif.txt", -5);
  }

  @Test
  public void choisissez_la_bonne_temperature() throws IOException {
    test("/easy/temperatures/choisir1.txt", 5);
  }

  @Test
  public void choisissez_la_bonne_temperature_2() throws IOException {
    test("/easy/temperatures/choisir2.txt", 5);
  }

  @Test
  public void donnees_complexes() throws IOException {
    test("/easy/temperatures/complexe.txt", 2);
  }

  @Test
  public void pas_de_temperature() throws IOException {
    test("/easy/temperatures/sans_temperature.txt", 0);
  }

  protected void test(String inputResource, int expected) throws IOException {
    try (InputStream input = getClass().getResourceAsStream(inputResource)) {
      assertThat(Solution.play(input)).isEqualTo(expected);
    }
  }
}
