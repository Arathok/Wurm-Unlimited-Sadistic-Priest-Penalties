package org.arathok.wurmunlimited.mods.torkelsSadisticPriestRestrictions;

import com.wurmonline.server.Players;
import com.wurmonline.server.creatures.Communicator;
import com.wurmonline.server.deities.Deities;
import com.wurmonline.server.players.Player;
import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.NotFoundException;
import org.gotti.wurmunlimited.modloader.classhooks.HookManager;
import org.gotti.wurmunlimited.modloader.interfaces.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TorkelsSadisticPriestRestrictions
        implements WurmServerMod, Initable, PreInitable, Configurable, ItemTemplatesCreatedListener, ServerStartedListener, ServerPollListener, PlayerMessageListener{

    public static final Logger logger = Logger.getLogger("TorkelsSadisticPriestRestrictions");
    public static Connection dbconn;


    @Override
    public void configure(Properties properties) {

    }

    @Override
    public void preInit() {

        logger.log(Level.INFO,"Injecting Skill gain stop for priests.");
        try {


            ClassPool classPool = HookManager.getInstance().getClassPool();
            CtClass ctSkill;
            ctSkill = classPool.getCtClass("com.wurmonline.server.skills.Skill");
            ctSkill.getMethod("doSkillGainNew", "(DDDFD)V")
                    //.insertBefore("org.arathok.wurmunlimited.mods.torkelsSadisticPriestRestrictions.Hook.version3(this);");
                    .insertBefore(
                            "com.wurmonline.server.players.Player p = null;\n" +
                            "        p = com.wurmonline.server.Players.getInstance().getPlayerOrNull(parent.getId());\n"+
                            "        com.wurmonline.server.items.Item equippedItem=p.getEquippedItem((byte)38);\n"+
                            "        com.wurmonline.server.items.ItemTemplate equippedTemplate=equippedItem.getTemplate();\n"+
                            "        if (p!=null&&p.getPower()<2) {\n" +
                            "           com.wurmonline.server.creatures.Communicator communicator = p.getCommunicator();\n" +
                            "            //TorkelsSadisticPriestRestrictions.logger.log(Level.SEVERE, \"Playernotfound!\");\n" +
                            "            if (p.isPriest()&&this.getKnowledge()>=1.1D)\n" +
                            "               if(!(equippedItem.getTemplateId()==81||equippedItem.getTemplateId()==87||equippedItem.getTemplateId()==290)&&\n"+
                            "                    (\n" +
                            "                        this.getNumber()==1000||\n" +
                            "                        this.getNumber()==1004||\n" +
                            "                        this.getNumber()==1003||\n" +
                            "                        this.getNumber()==1030||\n" +
                            "                        this.getNumber()==10079||\n" +
                            "                        this.getNumber()==10080||\n" +
                            "                        this.getNumber()==10081||\n" +
                            "                        this.getNumber()==10062||\n" +
                            "                        this.getNumber()==10063||\n" +
                            "                        this.getNumber()==10001||\n" +
                            "                        this.getNumber()==10024||\n" +
                            "                        this.getNumber()==10027||\n" +
                            "                        this.getNumber()==10005||\n" +
                            "                        this.getNumber()==10046||\n" +
                            "                        this.getNumber()==1002||\n" +
                            "                        this.getNumber()==10006||\n" +
                            "                        this.getNumber()==10019||\n" +
                            "                        this.getNumber()==10020||\n" +
                            "                        this.getNumber()==10021||\n" +
                            "                        this.getNumber()==10022||\n" +
                            "                        this.getNumber()==100023\n" +
                            "                            )) {\n" +
                            "            communicator.sendSafeServerMessage(\"The Magic that flows through your body now, makes it unwilling to use most battle weapons. You will gain no experience in \" + this.getName() + \".\");"+
                            "                return;\n" +
                            "            }\n" +
                            "        }\n"
                            );




        } catch (NotFoundException e) {
            TorkelsSadisticPriestRestrictions.logger.warning("couldnt find the class: "+e);
            e.printStackTrace();


        } catch (CannotCompileException e) {
            TorkelsSadisticPriestRestrictions.logger.warning("couldnt compile the inject: " +e);
            e.printStackTrace();


        }

        logger.log(Level.INFO,"Injecting Skill reset for priests.");
        try {
            ClassPool classPool = HookManager.getInstance().getClassPool();
            CtClass ctPlayer;
            ctPlayer = classPool.getCtClass("com.wurmonline.server.players.Player");
            ctPlayer.getMethod("setPriest", "(Z)V")
                    //.insertBefore("org.arathok.wurmunlimited.mods.torkelsSadisticPriestRestrictions.Hook.version3(this);");
                    .insertAfter("org.arathok.wurmunlimited.mods.torkelsSadisticPriestRestrictions.Hook.skillReset(this);");




        } catch (NotFoundException e) {
            TorkelsSadisticPriestRestrictions.logger.warning("couldnt find the class: "+e);
            e.printStackTrace();


        } catch (CannotCompileException e) {
            TorkelsSadisticPriestRestrictions.logger.warning("couldnt compile the inject: " +e);
            e.printStackTrace();


        }

    }

    @Override
    public boolean onPlayerMessage(Communicator communicator, String message) {
        if (message != null&&message.startsWith("#TorkelsSadisticPriestRestricitionsVersion"))
        {

            communicator.sendSafeServerMessage("TorkelsSadisticPriest Restriction Version 0.5 ");

        }

        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void onItemTemplatesCreated() {

        // TODO Auto-generated method stub

    }

    @Override
    public void onServerStarted() {
        // TODO Auto-generated method stub

    }

    @Override
    public void init() {
        // TODO Auto-generated method stub

    }

    @Override
    public void onServerPoll() {


    }





}
