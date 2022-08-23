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


        try {
            ClassPool classPool = HookManager.getInstance().getClassPool();
            CtClass ctCreationEntryCreator;
            ctCreationEntryCreator = classPool.getCtClass("com.wurmonline.server.skills.Skill");
            ctCreationEntryCreator.getMethod("doSkillGainNew", "(DLcom/wurmonline/server/skills/Skill;DDDFD)V")
                    .insertBefore("org.arathok.wurmunlimited.mods.torkelsSadisticPriestRestrictions.Hook.version3(this);");


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
