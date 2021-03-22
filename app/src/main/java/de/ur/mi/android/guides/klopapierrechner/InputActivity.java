package de.ur.mi.android.guides.klopapierrechner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * Mit dieser Anwendung haben NutzerInnen die Möglichkeit, ihren persönlichen Klopapierrollenvorrat
 * einzuschätzen. Dazu werden Anzahl der verfügbaren Rollen und die Größe des Haushalts eingegeben.
 * Die Anwendung berechnet dann, ie wie viele Tage dieser Vorrat noch reichen wird und wann ein
 * guter Zeitpunkt zum Einkaufen wären. Die Hinweise werden in einer zweiten Activity angezeigt.
 */

/**
 * Diese Activity dient der Eingabe der notwendigen Daten durch die NutzerInnen
 */

public class InputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // @GUIDE Diese Methode wird beim Start der Anwendung automatisch aufgerufen
        super.onCreate(savedInstanceState);
        // Das vorhandene Layout ersetzen wir im ersten Bearbeitungschritt durch eine neue Datei
        setContentView(R.layout.activity_input);
    }
}