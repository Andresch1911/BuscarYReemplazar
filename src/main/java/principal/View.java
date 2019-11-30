package principal;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class View extends VBox {
	    protected final HBox Panel;
	    protected final VBox Labels;
	    protected final Label buscarLabel;
	    protected final Label reemplazarLabel;
	    protected final VBox Checks;
	    protected final TextField buscarText;
	    protected final TextField reemplazarText;
	    protected final HBox checksArriba;
	    protected final CheckBox mayusCheck;
	    protected final CheckBox buscarCheck;
	    protected final HBox checksAbajo;
	    protected final CheckBox expresionCheck;
	    protected final CheckBox resaltaarCheck;
	    protected final VBox botonesView;
	    protected final Button buscarButton;
	    protected final Button reemplazarButton;
	    protected final Button todoButton;
	    protected final Button cerrarButton;
	    protected final Button ayudaButton;

	    public View() {

	        Panel = new HBox();
	        Labels = new VBox();
	        buscarLabel = new Label();
	        reemplazarLabel = new Label();
	        Checks = new VBox();
	        buscarText = new TextField();
	        reemplazarText = new TextField();
	        checksArriba = new HBox();
	        mayusCheck = new CheckBox();
	        buscarCheck = new CheckBox();
	        checksAbajo = new HBox();
	        expresionCheck = new CheckBox();
	        resaltaarCheck = new CheckBox();
	        botonesView = new VBox();
	        buscarButton = new Button();
	        reemplazarButton = new Button();
	        todoButton = new Button();
	        cerrarButton = new Button();
	        ayudaButton = new Button();

	        setMaxHeight(USE_PREF_SIZE);
	        setMaxWidth(USE_PREF_SIZE);
	        setMinHeight(USE_PREF_SIZE);
	        setMinWidth(USE_PREF_SIZE);
	        setPrefHeight(400.0);
	        setPrefWidth(600.0);

	        Panel.setPrefHeight(402.0);
	        Panel.setPrefWidth(600.0);

	        Labels.setPrefHeight(200.0);
	        Labels.setPrefWidth(100.0);

	        buscarLabel.setPrefHeight(17.0);
	        buscarLabel.setPrefWidth(55.0);
	        buscarLabel.setText("Buscar:");
	        buscarLabel.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
	        VBox.setMargin(buscarLabel, new Insets(5.0, 0.0, 0.0, 5.0));

	        reemplazarLabel.setText("Reemplazar con: ");
	        VBox.setMargin(reemplazarLabel, new Insets(25.0, 0.0, 0.0, 5.0));
	        HBox.setMargin(Labels, new Insets(5.0));

	        Checks.setPrefHeight(370.0);
	        Checks.setPrefWidth(369.0);

	        VBox.setMargin(buscarText, new Insets(5.0, 0.0, 0.0, 0.0));

	        VBox.setMargin(reemplazarText, new Insets(15.0, 0.0, 0.0, 0.0));

	        checksArriba.setPrefHeight(35.0);
	        checksArriba.setPrefWidth(388.0);

	        mayusCheck.setMnemonicParsing(false);
	        mayusCheck.setPrefHeight(17.0);
	        mayusCheck.setPrefWidth(172.0);
	        mayusCheck.setText("Mayusculas y minusculas");
	        HBox.setMargin(mayusCheck, new Insets(5.0));

	        buscarCheck.setMnemonicParsing(false);
	        buscarCheck.setText("Buscar hacia atras");
	        HBox.setMargin(buscarCheck, new Insets(5.0));
	        VBox.setMargin(checksArriba, new Insets(5.0));

	        checksAbajo.setPrefHeight(40.0);
	        checksAbajo.setPrefWidth(388.0);

	        expresionCheck.setMnemonicParsing(false);
	        expresionCheck.setPrefHeight(17.0);
	        expresionCheck.setPrefWidth(172.0);
	        expresionCheck.setText("Expresion regular");
	        HBox.setMargin(expresionCheck, new Insets(5.0));

	        resaltaarCheck.setMnemonicParsing(false);
	        resaltaarCheck.setText("Resaltar resultados");
	        HBox.setMargin(resaltaarCheck, new Insets(5.0));
	        VBox.setMargin(checksAbajo, new Insets(5.0));
	        HBox.setMargin(Checks, new Insets(5.0));

	        botonesView.setAlignment(javafx.geometry.Pos.TOP_CENTER);
	        botonesView.setPrefHeight(200.0);
	        botonesView.setPrefWidth(100.0);
	        botonesView.setOpaqueInsets(new Insets(5.0));

	        buscarButton.setMnemonicParsing(false);
	        buscarButton.setPrefHeight(25.0);
	        buscarButton.setPrefWidth(100.0);
	        buscarButton.setText("Buscar");
	        VBox.setMargin(buscarButton, new Insets(5.0));

	        reemplazarButton.setMnemonicParsing(false);
	        reemplazarButton.setPrefHeight(25.0);
	        reemplazarButton.setPrefWidth(100.0);
	        reemplazarButton.setText("Reemplazar");
	        VBox.setMargin(reemplazarButton, new Insets(5.0));

	        todoButton.setMnemonicParsing(false);
	        todoButton.setPrefHeight(25.0);
	        todoButton.setPrefWidth(100.0);
	        todoButton.setText("Reemplazar todo");
	        VBox.setMargin(todoButton, new Insets(5.0));

	        cerrarButton.setMnemonicParsing(false);
	        cerrarButton.setPrefHeight(25.0);
	        cerrarButton.setPrefWidth(100.0);
	        cerrarButton.setText("Cerrar");
	        VBox.setMargin(cerrarButton, new Insets(5.0));

	        ayudaButton.setMnemonicParsing(false);
	        ayudaButton.setPrefHeight(25.0);
	        ayudaButton.setPrefWidth(100.0);
	        ayudaButton.setText("Ayuda");
	        VBox.setMargin(ayudaButton, new Insets(5.0));
	        VBox.setMargin(Panel, new Insets(5.0));
	        setPadding(new Insets(5.0));

	        Labels.getChildren().add(buscarLabel);
	        Labels.getChildren().add(reemplazarLabel);
	        Panel.getChildren().add(Labels);
	        Checks.getChildren().add(buscarText);
	        Checks.getChildren().add(reemplazarText);
	        checksArriba.getChildren().add(mayusCheck);
	        checksArriba.getChildren().add(buscarCheck);
	        Checks.getChildren().add(checksArriba);
	        checksAbajo.getChildren().add(expresionCheck);
	        checksAbajo.getChildren().add(resaltaarCheck);
	        Checks.getChildren().add(checksAbajo);
	        Panel.getChildren().add(Checks);
	        botonesView.getChildren().add(buscarButton);
	        botonesView.getChildren().add(reemplazarButton);
	        botonesView.getChildren().add(todoButton);
	        botonesView.getChildren().add(cerrarButton);
	        botonesView.getChildren().add(ayudaButton);
	        Panel.getChildren().add(botonesView);
	        getChildren().add(Panel);

	    }
	}

