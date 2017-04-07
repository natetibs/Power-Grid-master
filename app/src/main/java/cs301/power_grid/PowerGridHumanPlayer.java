package cs301.power_grid;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import game.Game;
import game.GameHumanPlayer;
import game.GameMainActivity;
import game.infoMsg.GameInfo;

import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * @author Luchini Guilian, Tibbetts Nathan, Douville Luke, Hoang Paul
 */


public class PowerGridHumanPlayer extends GameHumanPlayer {

    //instance variables:

    //instance of android activity we are running
    private GameMainActivity myActivity;

    private PowerState powerState = new PowerState();

    private int selectNum = -1;
    private int bidValue = -1;
    private ResourceStore localStore = new ResourceStore();
    
    //GUI features
    private Spinner resourcesSpinner;
    private Spinner powerPlantsSpinner;
    private TextView powerPlant1Cost;
    private TextView powerPlant1Type;
    private TextView powerPlant1Number;
    private TextView powerPlant1House;
    private TextView powerPlant2Cost;
    private TextView powerPlant2Type;
    private TextView powerPlant2Number;
    private TextView powerPlant2House;
    private TextView powerPlant3Cost;
    private TextView powerPlant3Type;
    private TextView powerPlant3Number;
    private TextView powerPlant3House;
    private TextView powerPlant4Cost;
    private TextView powerPlant4Type;
    private TextView powerPlant4Number;
    private TextView powerPlant4House;
    private TextView moneyTextView;
    private TextView coalNumView;
    private TextView oilNumView;
    private TextView trashNumView;
    private TextView nuclearNumView;
    private TextView costTextView1;
    private TextView typeTextView1;
    private TextView numberTextView1;
    private TextView housesTextView1;
    private TextView costTextView2;
    private TextView typeTextView2;
    private TextView numberTextView2;
    private TextView housesTextView2;
    private TextView costTextView3;
    private TextView typeTextView3;
    private TextView numberTextView3;
    private TextView housesTextView3;
    private TextView costTextView4;
    private TextView typeTextView4;
    private TextView numberTextView4;
    private TextView housesTextView4;
    private EditText bidVal;

    private int basicGray = Color.rgb(214,215,215);
    private int prettyBlue = Color.rgb(0, 221, 255);

    private Button okayButton;
    private Button passButton;

    private Button selectButton0;
    private Button selectButton1;
    private Button selectButton2;
    private Button selectButton3;

    private Button denverBut;
    private boolean denverOn = false;

    private Button seaBut;
    private boolean seaOn = false;

    private Button sfBut;
    private boolean sfOn = false;

    private Button laBut;
    private boolean laOn = false;

    private Button missoulaBut;
    private boolean missoulaOn = false;

    private Button boiseBut;
    private boolean boiseOn = false;

    private Button phxBut;
    private boolean phxOn = false;

    private Button omahaBut;
    private boolean omahaOn = false;

    private Button okcBut;
    private boolean okcOn = false;

    private Button dallasBut;
    private boolean dallasOn = false;

    private Button houBut;
    private boolean houOn = false;

    private Button stlouBut;
    private boolean stlouOn = false;

    private Button chiBut;
    private boolean chiOn = false;

    private Button memBut;
    private boolean memOn = false;

    private Button neworlBut;
    private boolean neworlOn = false;

    private Button detBut;
    private boolean detOn = false;

    private Button atlBut;
    private boolean atlOn = false;

    private Button miamiBut;
    private boolean miamiOn = false;

    private Button bosBut;
    private boolean bosOn = false;

    private Button nycBut;
    private boolean nycOn = false;

    private ImageButton coalButton1;
    private ImageButton coalButton2;
    private ImageButton coalButton3;
    private ImageButton coalButton4;
    private ImageButton coalButton5;
    private ImageButton coalButton6;
    private ImageButton coalButton7;
    private ImageButton coalButton8;
    private ImageButton coalButton9;
    private ImageButton coalButton10;
    private ImageButton coalButton11;
    private ImageButton coalButton12;
    private ImageButton coalButton13;
    private ImageButton coalButton14;
    private ImageButton coalButton15;
    
    private ImageButton oilButton1;
    private ImageButton oilButton2;
    private ImageButton oilButton3;
    private ImageButton oilButton4;
    private ImageButton oilButton5;
    private ImageButton oilButton6;
    private ImageButton oilButton7;
    private ImageButton oilButton8;
    private ImageButton oilButton9;
    private ImageButton oilButton10;

    private ImageButton uraniumButton1;
    private ImageButton uraniumButton2;
    private ImageButton uraniumButton3;
    private ImageButton uraniumButton4;
    private ImageButton uraniumButton5;

    private ImageButton trashButton1;
    private ImageButton trashButton2;
    private ImageButton trashButton3;
    private ImageButton trashButton4;
    private ImageButton trashButton5;
    private ImageButton trashButton6;
    private ImageButton trashButton7;
    private ImageButton trashButton8;
    private ImageButton trashButton9;
    private ImageButton trashButton10;
    private ImageButton trashButton11;
    private ImageButton trashButton12;
    private ImageButton trashButton13;
    private ImageButton trashButton14;
    private ImageButton trashButton15;

    //Constructor
    public PowerGridHumanPlayer(String name){
        super(name);
    }

    @Override
    public View getTopView() {
        return (RelativeLayout)findViewById(R.id.activity_main);
    }

    @Override
    public void receiveInfo(GameInfo info) {
        //if (powerState == null){return;}

        //check if info is a gameState
        if (info instanceof PowerState){

            PowerState powerState = (PowerState) info;

            //update GUI -
            //look at what phase game is in then update accordingly
            int phase = powerState.getGamePhase();
            if(phase == 0){

            }
            else if (phase == 1 ){

            }
            else if (phase == 2 ){

            }
            else if (phase == 3 ){

            }
            else if (phase == 4 ){

            }
            else if (phase == 5 ){

            }
            else if (phase == 6 ){

            }

        }
    }

    @Override
    public void setAsGui(GameMainActivity activity) {

        // remember the activity
        myActivity = activity;

        // Load the layout resource for our GUI
        activity.setContentView(R.layout.activity_main);
    }

    /**************************
     * onCreate
     *
     * initializes buttons and registers them to listeners
     *
     * @param savedInstanceState
     *************************/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //spinners
        resourcesSpinner =(Spinner)findViewById(R.id.UserResourcesSpinner);
        resourcesSpinner.setOnItemSelectedListener(new resourcesSpinListener());

        powerPlantsSpinner =(Spinner)findViewById(R.id.userPowerPlantsSpinner);
        powerPlantsSpinner.setOnItemSelectedListener(new powerPlantsSpinListener());

        //okay and pass buttons
        okayButton = (Button)findViewById(R.id.okButton);
        okayButton.setOnClickListener(new okayButListener());

        passButton = (Button)findViewById(R.id.passButton);
        passButton.setOnClickListener(new passButListener());

        //select buttons
        selectButton0 = (Button)findViewById(R.id.select1);
        selectButton1 = (Button)findViewById(R.id.select2);
        selectButton2 = (Button)findViewById(R.id.select3);
        selectButton3 = (Button)findViewById(R.id.select4);

        //bid edit text
        bidVal = (EditText)findViewById(R.id.bidEditText);
        bidValue = Integer.parseInt(bidVal.getText().toString());

        //sale power plants
        powerPlant1Cost = (TextView)findViewById(R.id.pp1cValue);
        powerPlant1Type = (TextView)findViewById(R.id.pp1tValue);
        powerPlant1Number = (TextView)findViewById(R.id.pp1nValue);
        powerPlant1House = (TextView)findViewById(R.id.pp1hValue);

        powerPlant2Cost = (TextView)findViewById(R.id.pp2cValue);
        powerPlant2Type = (TextView)findViewById(R.id.pp2tValue);
        powerPlant2Number = (TextView)findViewById(R.id.pp2nValue);
        powerPlant2House = (TextView)findViewById(R.id.pp2hValue);

        powerPlant3Cost = (TextView)findViewById(R.id.pp3cValue);
        powerPlant3Type = (TextView)findViewById(R.id.pp3tValue);
        powerPlant3Number = (TextView)findViewById(R.id.pp3nValue);
        powerPlant3House = (TextView)findViewById(R.id.pp3hValue);

        powerPlant4Cost = (TextView)findViewById(R.id.pp4cValue);
        powerPlant4Type = (TextView)findViewById(R.id.pp4tValue);
        powerPlant4Number = (TextView)findViewById(R.id.pp4nValue);
        powerPlant4House = (TextView)findViewById(R.id.pp4hValue);

        //owned resources and cash
        moneyTextView = (TextView)findViewById(R.id.moneyTextView);
        coalNumView =(TextView)findViewById(R.id.coalNumView);
        oilNumView =(TextView)findViewById(R.id.oilNumView);
        trashNumView =(TextView)findViewById(R.id.trashNumView);
        nuclearNumView=(TextView)findViewById(R.id.nuclearTextView);

        //owned power plant grid
        costTextView1 = (TextView)findViewById(R.id.upp1cValue);
        typeTextView1 = (TextView)findViewById(R.id.upp1tValue);
        numberTextView1 = (TextView)findViewById(R.id.upp1nValue);
        housesTextView1 = (TextView)findViewById(R.id.upp1hValue);

        costTextView2 = (TextView)findViewById(R.id.upp2cValue);
        typeTextView2 = (TextView)findViewById(R.id.upp2tValue);
        numberTextView2 = (TextView)findViewById(R.id.upp2nValue);
        housesTextView2 = (TextView)findViewById(R.id.upp2hValue);

        costTextView3 = (TextView)findViewById(R.id.upp3cValue);
        typeTextView3 = (TextView)findViewById(R.id.upp3tValue);
        numberTextView3 = (TextView)findViewById(R.id.upp3nValue);
        housesTextView3 = (TextView)findViewById(R.id.upp3hValue);

        costTextView4 = (TextView)findViewById(R.id.upp4cValue);
        typeTextView4 = (TextView)findViewById(R.id.upp4tValue);
        numberTextView4 = (TextView)findViewById(R.id.upp4nValue);
        housesTextView4 = (TextView)findViewById(R.id.upp4hValue);

        //resource buttons
        coalButton1 = (ImageButton)findViewById(R.id.cb1);
        coalButton2 = (ImageButton)findViewById(R.id.cb2);
        coalButton3 = (ImageButton)findViewById(R.id.cb3);
        coalButton4 = (ImageButton)findViewById(R.id.cb4);
        coalButton5 = (ImageButton)findViewById(R.id.cb5);
        coalButton6 = (ImageButton)findViewById(R.id.cb6);
        coalButton7 = (ImageButton)findViewById(R.id.cb7);
        coalButton8 = (ImageButton)findViewById(R.id.cb8);
        coalButton9 = (ImageButton)findViewById(R.id.cb9);
        coalButton10 = (ImageButton)findViewById(R.id.cb10);
        coalButton11 = (ImageButton)findViewById(R.id.cb11);
        coalButton12 = (ImageButton)findViewById(R.id.cb12);
        coalButton13 = (ImageButton)findViewById(R.id.cb13);
        coalButton14 = (ImageButton)findViewById(R.id.cb14);
        coalButton15 = (ImageButton)findViewById(R.id.cb15);
        
        coalButton1.setOnClickListener(new CoalButtonListener());
        coalButton2.setOnClickListener(new CoalButtonListener());
        coalButton3.setOnClickListener(new CoalButtonListener());
        coalButton4.setOnClickListener(new CoalButtonListener());
        coalButton5.setOnClickListener(new CoalButtonListener());
        coalButton6.setOnClickListener(new CoalButtonListener());
        coalButton7.setOnClickListener(new CoalButtonListener());
        coalButton8.setOnClickListener(new CoalButtonListener());
        coalButton9.setOnClickListener(new CoalButtonListener());
        coalButton10.setOnClickListener(new CoalButtonListener());
        coalButton11.setOnClickListener(new CoalButtonListener());
        coalButton12.setOnClickListener(new CoalButtonListener());
        coalButton13.setOnClickListener(new CoalButtonListener());
        coalButton14.setOnClickListener(new CoalButtonListener());
        coalButton15.setOnClickListener(new CoalButtonListener());
        
        oilButton1 = (ImageButton)findViewById(R.id.ob1);
        oilButton2 = (ImageButton)findViewById(R.id.ob2);
        oilButton3 = (ImageButton)findViewById(R.id.ob3);
        oilButton4 = (ImageButton)findViewById(R.id.ob4);
        oilButton5 = (ImageButton)findViewById(R.id.ob5);
        oilButton6 = (ImageButton)findViewById(R.id.ob6);
        oilButton7 = (ImageButton)findViewById(R.id.ob7);
        oilButton8 = (ImageButton)findViewById(R.id.ob8);
        oilButton9 = (ImageButton)findViewById(R.id.ob9);
        oilButton10 = (ImageButton)findViewById(R.id.ob10);
        
        oilButton1.setOnClickListener(new OilButtonListener());
        oilButton2.setOnClickListener(new OilButtonListener());
        oilButton3.setOnClickListener(new OilButtonListener());
        oilButton4.setOnClickListener(new OilButtonListener());
        oilButton5.setOnClickListener(new OilButtonListener());
        oilButton6.setOnClickListener(new OilButtonListener());
        oilButton7.setOnClickListener(new OilButtonListener());
        oilButton8.setOnClickListener(new OilButtonListener());
        oilButton9.setOnClickListener(new OilButtonListener());
        oilButton10.setOnClickListener(new OilButtonListener());

        uraniumButton1 = (ImageButton)findViewById(R.id.ub1);
        uraniumButton2 = (ImageButton)findViewById(R.id.ub2);
        uraniumButton3 = (ImageButton)findViewById(R.id.ub3);
        uraniumButton4 = (ImageButton)findViewById(R.id.ub4);
        uraniumButton5 = (ImageButton)findViewById(R.id.ub5);
        
        uraniumButton1.setOnClickListener(new NuclearButtonListener());
        uraniumButton2.setOnClickListener(new NuclearButtonListener());
        uraniumButton3.setOnClickListener(new NuclearButtonListener());
        uraniumButton4.setOnClickListener(new NuclearButtonListener());
        uraniumButton5.setOnClickListener(new NuclearButtonListener());

        trashButton1 = (ImageButton)findViewById(R.id.tb1);
        trashButton2 = (ImageButton)findViewById(R.id.tb2);
        trashButton3 = (ImageButton)findViewById(R.id.tb3);
        trashButton4 = (ImageButton)findViewById(R.id.tb4);
        trashButton5 = (ImageButton)findViewById(R.id.tb5);
        trashButton6 = (ImageButton)findViewById(R.id.tb6);
        trashButton7 = (ImageButton)findViewById(R.id.tb7);
        trashButton8 = (ImageButton)findViewById(R.id.tb8);
        trashButton9 = (ImageButton)findViewById(R.id.tb9);
        trashButton10 = (ImageButton)findViewById(R.id.tb10);
        trashButton11 = (ImageButton)findViewById(R.id.tb11);
        trashButton12 = (ImageButton)findViewById(R.id.tb12);
        trashButton13 = (ImageButton)findViewById(R.id.tb13);
        trashButton14 = (ImageButton)findViewById(R.id.tb14);
        trashButton15 = (ImageButton)findViewById(R.id.tb15);
        
        trashButton1.setOnClickListener(new TrashButtonListener());
        trashButton2.setOnClickListener(new TrashButtonListener());
        trashButton3.setOnClickListener(new TrashButtonListener());
        trashButton4.setOnClickListener(new TrashButtonListener());
        trashButton5.setOnClickListener(new TrashButtonListener());
        trashButton6.setOnClickListener(new TrashButtonListener());
        trashButton7.setOnClickListener(new TrashButtonListener());
        trashButton8.setOnClickListener(new TrashButtonListener());
        trashButton9.setOnClickListener(new TrashButtonListener());
        trashButton10.setOnClickListener(new TrashButtonListener());
        trashButton11.setOnClickListener(new TrashButtonListener());
        trashButton12.setOnClickListener(new TrashButtonListener());
        trashButton13.setOnClickListener(new TrashButtonListener());
        trashButton14.setOnClickListener(new TrashButtonListener());
        trashButton15.setOnClickListener(new TrashButtonListener());

        //city buttons
        denverBut = (Button) findViewById(R.id.button4);
        denverBut.setOnClickListener(new denverButListener());

        seaBut = (Button) findViewById(R.id.button);
        seaBut.setOnClickListener(new seaButListener());

        sfBut = (Button) findViewById(R.id.button2);
        sfBut.setOnClickListener(new sfButListener());

        laBut = (Button) findViewById(R.id.button3);
        laBut.setOnClickListener(new laButListener());

        missoulaBut = (Button) findViewById(R.id.button21);
        missoulaBut.setOnClickListener(new missoulaButListener());

        boiseBut = (Button) findViewById(R.id.button20);
        boiseBut.setOnClickListener(new boiseButListener());

        phxBut = (Button) findViewById(R.id.button7);
        phxBut.setOnClickListener(new phxButListener());

        omahaBut = (Button) findViewById(R.id.button5);
        omahaBut.setOnClickListener(new omahaButListener());

        okcBut = (Button) findViewById(R.id.button19);
        okcBut.setOnClickListener(new okcButListener());

        dallasBut = (Button) findViewById(R.id.button9);
        dallasBut.setOnClickListener(new dallasButListener());

        houBut = (Button) findViewById(R.id.button8);
        houBut.setOnClickListener(new houButListener());

        stlouBut = (Button) findViewById(R.id.button10);
        stlouBut.setOnClickListener(new stlouButListener());

        chiBut = (Button) findViewById(R.id.button6);
        chiBut.setOnClickListener(new chiButListener());

        memBut = (Button) findViewById(R.id.button12);
        memBut.setOnClickListener(new memButListener());

        neworlBut = (Button) findViewById(R.id.button11);
        neworlBut.setOnClickListener(new neworlButListener());

        detBut = (Button) findViewById(R.id.button17);
        detBut.setOnClickListener(new detButListener());

        atlBut = (Button) findViewById(R.id.button14);
        atlBut.setOnClickListener(new atlButListener());

        miamiBut = (Button) findViewById(R.id.button15);
        miamiBut.setOnClickListener(new miamiButListener());

        nycBut = (Button) findViewById(R.id.button16);
        nycBut.setOnClickListener(new nycButListener());

        bosBut = (Button) findViewById(R.id.button18);
        bosBut.setOnClickListener(new bosButListener());
    }

    /**
     * setResources
     *
     * to be used in the spinners methods, sets resources text on GUI
     *
     * @param rsc //resource
     */
    private void setResources(Inventory rsc){
        moneyTextView.setText(""+ rsc.getMoney());
        coalNumView.setText(""+ rsc.getCoal());
        oilNumView.setText("" + rsc.getOil());
        trashNumView.setText("" + rsc.getTrash());
        nuclearNumView.setText("" + rsc.getUranium());
    }

    /**
     * setPowerPlants
     *
     * to be used in the spinners methods, sets power plants text on GUI
     *
     * @param upp //userPowerPlant
     */
    private void setPowerPlants(Inventory upp) {
        costTextView1.setText("");
        typeTextView1.setText("");
        numberTextView1.setText("");
        housesTextView1.setText("");

        costTextView2.setText("");
        typeTextView2.setText("");
        numberTextView2.setText("");
        housesTextView2.setText("");

        costTextView3.setText("");
        typeTextView3.setText("");
        numberTextView3.setText("");
        housesTextView3.setText("");

        costTextView4.setText("");
        typeTextView4.setText("");
        numberTextView4.setText("");
        housesTextView4.setText("");

        if (upp.getMyPlants().size() > 0) {
            costTextView1.setText("" + upp.getMyPlants().get(0).getCost());
            typeTextView1.setText("" + upp.getMyPlants().get(0).getKind());
            numberTextView1.setText("" + upp.getMyPlants().get(0).getPtP());
            housesTextView1.setText("" + upp.getMyPlants().get(0).getHp());
        }
        if (upp.getMyPlants().size() > 1) {
            costTextView2.setText("" + upp.getMyPlants().get(1).getCost());
            typeTextView2.setText("" + upp.getMyPlants().get(1).getKind());
            numberTextView2.setText("" + upp.getMyPlants().get(1).getPtP());
            housesTextView2.setText("" + upp.getMyPlants().get(1).getHp());
        }
        if (upp.getMyPlants().size() > 2) {
            costTextView3.setText("" + upp.getMyPlants().get(2).getCost());
            typeTextView3.setText("" + upp.getMyPlants().get(2).getKind());
            numberTextView3.setText("" + upp.getMyPlants().get(2).getPtP());
            housesTextView3.setText("" + upp.getMyPlants().get(2).getHp());
        }
        if (upp.getMyPlants().size() > 3) {
            costTextView4.setText("" + upp.getMyPlants().get(3).getCost());
            typeTextView4.setText("" + upp.getMyPlants().get(3).getKind());
            numberTextView4.setText("" + upp.getMyPlants().get(3).getPtP());
            housesTextView4.setText("" + upp.getMyPlants().get(3).getHp());
        }
    }

    /**
     * resourceSpinListener
     *
     * configures the spinner in the upper left of the GUI to display
     * either Humanplayers resources or opponent
     */
    private class resourcesSpinListener implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            //String currVal = resourcesSpinner.getSelectedItem().toString();
            switch (position){
                case 0:
                    setResources(powerState.getGameInventories().get(0));
                    break;
                case 1:
                    setResources(powerState.getGameInventories().get(1));
                    break;
            }
        }
        @Override
        public void onNothingSelected(AdapterView<?> parentView) {
            //do nothing
        }
    }

    /**
     * powerPlantsSpinListener
     *
     * configures the spinner on the map to display
     * either Human Opponent's powerplants
     */
    private class powerPlantsSpinListener implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            //String currVal = resourcesSpinner.getSelectedItem().toString();
            switch (position){
                case 0:
                    setPowerPlants(powerState.getGameInventories().get(0));
                    break;
                case 1:
                    setPowerPlants(powerState.getGameInventories().get(1));
                    break;
            }
        }
        @Override
        public void onNothingSelected(AdapterView<?> parentView) {
            //do nothing
        }
    }

    private class okayButListener implements View.OnClickListener{
        public void onClick(View v){


            if(powerState.getTurn() != powerState.getPlayerId()){
                return;
            }
            int phase = powerState.getGamePhase();
            if(phase == 0){

                    SelectPowerPlantAction sppa = new SelectPowerPlantAction(PowerGridHumanPlayer.this, selectNum);
                    game.sendAction(sppa);

            }
            else if (phase == 1 ){

                    BidAction ba = new BidAction(PowerGridHumanPlayer.this, bidValue);
                    game.sendAction(ba);

            }
            else if (phase == 2 ){

                 SelectPowerPlantAction sppa = new SelectPowerPlantAction(PowerGridHumanPlayer.this, selectNum);
                 game.sendAction(sppa);

            }
            else if (phase == 3 ){
                for(int i = 0; i < 15; i++){
                    //if it's not available in the local store, it must have been bought!
                    if(!localStore.coal[i]){
                        BuyCoalAction bca = new BuyCoalAction(PowerGridHumanPlayer.this, i);
                        game.sendAction(bca);
                    }
                    if(!localStore.trash[i]){
                        BuyTrashAction bta = new BuyTrashAction(PowerGridHumanPlayer.this, i);
                        game.sendAction(bta);
                    }
                    if(i < 5){
                        if(!localStore.uranium[i]) {
                            BuyUraniumAction bua = new BuyUraniumAction(PowerGridHumanPlayer.this, i);
                            game.sendAction(bua);
                        }
                    }
                    if(i < 10){
                        if(!localStore.oil[i]) {
                            BuyOilAction boa = new BuyOilAction(PowerGridHumanPlayer.this, i);
                            game.sendAction(boa);
                        }
                    }
                }


            }
            else if (phase == 4 ){
                for(int i = 0; i < 15; i++){
                    //if it's not available in the local store, it must have been bought!
                    if(!localStore.coal[i]){
                        BuyCoalAction bca = new BuyCoalAction(PowerGridHumanPlayer.this, i);
                        game.sendAction(bca);
                    }
                    if(!localStore.trash[i]){
                        BuyTrashAction bta = new BuyTrashAction(PowerGridHumanPlayer.this, i);
                        game.sendAction(bta);
                    }
                    if(i < 5){
                        if(!localStore.uranium[i]) {
                            BuyUraniumAction bua = new BuyUraniumAction(PowerGridHumanPlayer.this, i);
                            game.sendAction(bua);
                        }
                    }
                    if(i < 10){
                        if(!localStore.oil[i]) {
                            BuyOilAction boa = new BuyOilAction(PowerGridHumanPlayer.this, i);
                            game.sendAction(boa);
                        }
                    }
                }

            }
            else if (phase == 5 ){

            }
            else if (phase == 6 ){

            }


        }
    }

    private class passButListener implements View.OnClickListener{
        public void onClick(View v){

        }
    }

    private class select0ButListener implements View.OnClickListener{
        public void onClick(View v){
            selectNum = 0;
            selectButton0.setBackgroundColor(Color.YELLOW);
            selectButton1.setBackgroundColor(prettyBlue);
            selectButton2.setBackgroundColor(prettyBlue);
            selectButton3.setBackgroundColor(prettyBlue);
        }
    }

    private class select1ButListener implements View.OnClickListener{
        public void onClick(View v){
            selectNum = 1;
            selectButton1.setBackgroundColor(Color.YELLOW);
            selectButton0.setBackgroundColor(prettyBlue);
            selectButton2.setBackgroundColor(prettyBlue);
            selectButton3.setBackgroundColor(prettyBlue);
        }
    }

    private class select2ButListener implements View.OnClickListener{
        public void onClick(View v){
            selectNum = 2;
            selectButton2.setBackgroundColor(Color.YELLOW);
            selectButton0.setBackgroundColor(prettyBlue);
            selectButton1.setBackgroundColor(prettyBlue);
            selectButton3.setBackgroundColor(prettyBlue);
        }
    }

    private class select3ButListener implements View.OnClickListener{
        public void onClick(View v){
            selectNum = 3;
            selectButton3.setBackgroundColor(Color.YELLOW);
            selectButton2.setBackgroundColor(prettyBlue);
            selectButton1.setBackgroundColor(prettyBlue);
            selectButton0.setBackgroundColor(prettyBlue);
        }
    }


    private class denverButListener implements View.OnClickListener {
        public void onClick(View v) {
            if (denverOn) {


                denverBut.setBackgroundColor(basicGray);

                denverOn = false;
            } else {

                denverBut.setBackgroundColor(prettyBlue);
                denverOn = true;
            }
        }
    }

    private class seaButListener implements View.OnClickListener {
        public void onClick(View v) {
            if (seaOn) {


                seaBut.setBackgroundColor(basicGray);

                seaOn = false;
            } else {

                seaBut.setBackgroundColor(prettyBlue);
                seaOn = true;
            }
        }
    }

    private class bosButListener implements View.OnClickListener {
        public void onClick(View v) {
            if (bosOn) {


                bosBut.setBackgroundColor(basicGray);

                bosOn = false;
            } else {

                bosBut.setBackgroundColor(prettyBlue);
                bosOn = true;
            }
        }
    }

    private class nycButListener implements View.OnClickListener {
        public void onClick(View v) {
            if (nycOn) {


                nycBut.setBackgroundColor(basicGray);

                nycOn = false;
            } else {

                nycBut.setBackgroundColor(prettyBlue);
                nycOn = true;
            }
        }
    }

    private class miamiButListener implements View.OnClickListener {
        public void onClick(View v) {
            if (miamiOn) {


                miamiBut.setBackgroundColor(basicGray);

                miamiOn = false;
            } else {

                miamiBut.setBackgroundColor(prettyBlue);
                miamiOn = true;
            }
        }
    }

    private class atlButListener implements View.OnClickListener {
        public void onClick(View v) {
            if (atlOn) {


                atlBut.setBackgroundColor(basicGray);

                atlOn = false;
            } else {

                atlBut.setBackgroundColor(prettyBlue);
                atlOn = true;
            }
        }
    }

    private class detButListener implements View.OnClickListener {
        public void onClick(View v) {
            if (detOn) {


                detBut.setBackgroundColor(basicGray);

                detOn = false;
            } else {

                detBut.setBackgroundColor(prettyBlue);
                detOn = true;
            }
        }
    }

    private class chiButListener implements View.OnClickListener {
        public void onClick(View v) {
            if (chiOn) {


                chiBut.setBackgroundColor(basicGray);

                chiOn = false;
            } else {

                chiBut.setBackgroundColor(prettyBlue);
                chiOn = true;
            }
        }
    }

    private class neworlButListener implements View.OnClickListener {
        public void onClick(View v) {
            if (neworlOn) {


                neworlBut.setBackgroundColor(basicGray);

                neworlOn = false;
            } else {

                neworlBut.setBackgroundColor(prettyBlue);
                neworlOn = true;
            }
        }
    }

    private class memButListener implements View.OnClickListener {
        public void onClick(View v) {
            if (memOn) {


                memBut.setBackgroundColor(basicGray);

                memOn = false;
            } else {

                memBut.setBackgroundColor(prettyBlue);
                memOn = true;
            }
        }
    }

    private class stlouButListener implements View.OnClickListener {
        public void onClick(View v) {
            if (stlouOn) {


                stlouBut.setBackgroundColor(basicGray);

                stlouOn = false;
            } else {

                stlouBut.setBackgroundColor(prettyBlue);
                stlouOn = true;
            }
        }
    }

    private class houButListener implements View.OnClickListener {
        public void onClick(View v) {
            if (houOn) {


                houBut.setBackgroundColor(basicGray);

                houOn = false;
            } else {

                houBut.setBackgroundColor(prettyBlue);
                houOn = true;
            }
        }
    }

    private class dallasButListener implements View.OnClickListener {
        public void onClick(View v) {
            if (dallasOn) {


                dallasBut.setBackgroundColor(basicGray);

                dallasOn = false;
            } else {

                dallasBut.setBackgroundColor(prettyBlue);
                dallasOn = true;
            }
        }
    }

    private class okcButListener implements View.OnClickListener {
        public void onClick(View v) {
            if (okcOn) {


                okcBut.setBackgroundColor(basicGray);

                okcOn = false;
            } else {

                okcBut.setBackgroundColor(prettyBlue);
                okcOn = true;
            }
        }
    }

    private class omahaButListener implements View.OnClickListener {
        public void onClick(View v) {
            if (omahaOn) {


                omahaBut.setBackgroundColor(basicGray);

                omahaOn = false;
            } else {

                omahaBut.setBackgroundColor(prettyBlue);
                omahaOn = true;
            }
        }
    }

    private class phxButListener implements View.OnClickListener {
        public void onClick(View v) {
            if (phxOn) {


                phxBut.setBackgroundColor(basicGray);

                phxOn = false;
            } else {

                phxBut.setBackgroundColor(prettyBlue);
                phxOn = true;
            }
        }
    }

    private class boiseButListener implements View.OnClickListener {
        public void onClick(View v) {
            if (boiseOn) {


                boiseBut.setBackgroundColor(basicGray);

                boiseOn = false;
            } else {

                boiseBut.setBackgroundColor(prettyBlue);
                boiseOn = true;
            }
        }
    }

    private class missoulaButListener implements View.OnClickListener {
        public void onClick(View v) {
            if (missoulaOn) {


                missoulaBut.setBackgroundColor(basicGray);

                missoulaOn = false;
            } else {

                missoulaBut.setBackgroundColor(prettyBlue);
                missoulaOn = true;
            }
        }
    }

    private class laButListener implements View.OnClickListener {
        public void onClick(View v) {
            if (laOn) {


                laBut.setBackgroundColor(basicGray);

                laOn = false;
            } else {

                laBut.setBackgroundColor(prettyBlue);
                laOn = true;
            }
        }
    }

    private class sfButListener implements View.OnClickListener {
        public void onClick(View v) {
            if (sfOn) {


                sfBut.setBackgroundColor(basicGray);

                sfOn = false;
            } else {

                sfBut.setBackgroundColor(prettyBlue);
                sfOn = true;
            }
        }
    }

    //implements the coal buttons
    public class CoalButtonListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {

            int viewId = view.getId();
            int[] idNum = new int[15];
            idNum[0] = R.id.cb1;
            idNum[1] = R.id.cb2;
            idNum[2] = R.id.cb3;
            idNum[3] = R.id.cb4;
            idNum[4] = R.id.cb5;
            idNum[5] = R.id.cb6;
            idNum[6] = R.id.cb7;
            idNum[7] = R.id.cb8;
            idNum[8] = R.id.cb9;
            idNum[9] = R.id.cb10;
            idNum[10] = R.id.cb11;
            idNum[11] = R.id.cb12;
            idNum[12] = R.id.cb13;
            idNum[13] = R.id.cb14;
            idNum[14] = R.id.cb15;


            for (int i = 0; i < 15; i++) {
                if (viewId == idNum[i]) {
                    if (powerState.getAvailableResources.coal[i]) {
                        if (localStore.coal[i]) {
                            coalButton1.setBackgroundColor(Color.TRANSPARENT);
                            localStore.coal[i] = false;
                        } else {
                            coalButton1.setBackgroundColor(Color.OPAQUE);
                            localStore.coal[i] = true;
                        }
                    }
                }
            }

        }
    }

    //implements the oil buttons
    public class OilButtonListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            int viewId = view.getId();
            int[] idNum = new int[15];
            idNum[0] = R.id.ob1;
            idNum[1] = R.id.ob2;
            idNum[2] = R.id.ob3;
            idNum[3] = R.id.ob4;
            idNum[4] = R.id.ob5;
            idNum[5] = R.id.ob6;
            idNum[6] = R.id.ob7;
            idNum[7] = R.id.ob8;
            idNum[8] = R.id.ob9;
            idNum[9] = R.id.ob10;



            for (int i = 0; i < 10; i++) {
                if (viewId == idNum[i]) {
                    if (powerState.getAvailableResources.oil[i]) {
                        if (localStore.oil[i]) {
                            oilButton1.setBackgroundColor(Color.TRANSPARENT);
                            localStore.oil[i] = false;
                        } else {
                            oilButton1.setBackgroundColor(Color.OPAQUE);
                            localStore.oil[i] = true;
                        }
                    }
                }
            }

        }
    }

    //implements the trash buttons
    public class TrashButtonListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            int viewId = view.getId();
            int[] idNum = new int[15];
            idNum[0] = R.id.tb1;
            idNum[1] = R.id.tb2;
            idNum[2] = R.id.tb3;
            idNum[3] = R.id.tb4;
            idNum[4] = R.id.tb5;
            idNum[5] = R.id.tb6;
            idNum[6] = R.id.tb7;
            idNum[7] = R.id.tb8;
            idNum[8] = R.id.tb9;
            idNum[9] = R.id.tb10;
            idNum[10] = R.id.tb11;
            idNum[11] = R.id.tb12;
            idNum[12] = R.id.tb13;
            idNum[13] = R.id.tb14;
            idNum[14] = R.id.tb15;


            for (int i = 0; i < 15; i++) {
                if (viewId == idNum[i]) {
                    if (powerState.getAvailableResources.trash[i]) {
                        if (localStore.trash[i]) {
                            trashButton1.setBackgroundColor(Color.TRANSPARENT);
                            localStore.trash[i] = false;
                        } else {
                            trashButton1.setBackgroundColor(Color.OPAQUE);
                            localStore.trash[i] = true;
                        }
                    }
                }
            }

        }
    }

    //implements the nuclear buttons
    public class NuclearButtonListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            int viewId = view.getId();
            int[] idNum = new int[15];
            idNum[0] = R.id.nb1;
            idNum[1] = R.id.nb2;
            idNum[2] = R.id.nb3;
            idNum[3] = R.id.nb4;
            idNum[4] = R.id.nb5;



            for (int i = 0; i < 5; i++) {
                if (viewId == idNum[i]) {
                    if (powerState.getAvailableResources.uranium[i]) {
                        if (localStore.uranium[i]) {
                            uraniumButton1.setBackgroundColor(Color.TRANSPARENT);
                            localStore.uranium[i] = false;
                        } else {
                            uraniumButton1.setBackgroundColor(Color.OPAQUE);
                            localStore.uranium[i] = true;
                        }
                    }
                }
            }

        }
    }


}
