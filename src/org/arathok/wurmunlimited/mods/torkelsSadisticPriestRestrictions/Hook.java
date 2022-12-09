package org.arathok.wurmunlimited.mods.torkelsSadisticPriestRestrictions;

import com.wurmonline.server.Players;
import com.wurmonline.server.items.ItemList;
import com.wurmonline.server.items.NoSpaceException;
import com.wurmonline.server.players.Player;

import com.wurmonline.server.skills.*;
import org.gotti.wurmunlimited.modloader.ReflectionUtil;
import sun.reflect.misc.FieldUtil;

import java.lang.reflect.Field;
import java.util.logging.Level;

public class Hook {
public static Field parent;
    public static void skillReset(Player aPlayer) {
        try {
            int deityNum=aPlayer.getDeity().getNumber();
            if (deityNum==1)
            {

                aPlayer.getSkills().getSkill(1030).setKnowledge(1.0001,false);// Archery
                aPlayer.getSkills().getSkill(10080).setKnowledge(1.0001,false); // Bow Short
                aPlayer.getSkills().getSkill(10079).setKnowledge(1.0001,false);// Bow Medium
                aPlayer.getSkills().getSkill(10081).setKnowledge(1.0001,false); // Bow Long
                aPlayer.getSkills().getSkill(1004).setKnowledge(1.0001,false); // Mauls
                aPlayer.getSkills().getSkill(10061).setKnowledge(1.0001,false); // Maul Large
                aPlayer.getSkills().getSkill(10062).setKnowledge(1.0001,false); // Maul Medium
                aPlayer.getSkills().getSkill(10063).setKnowledge(1.0001,false); // Maul Small
                aPlayer.getSkills().getSkill(1003).setKnowledge(1.0001,false); // Axes
                aPlayer.getSkills().getSkill(10001).setKnowledge(1.0001,false); // Axe Small
                aPlayer.getSkills().getSkill(10024).setKnowledge(1.0001,false); // Axe large
                aPlayer.getSkills().getSkill(10025).setKnowledge(1.0001,false); // Axe huge
                aPlayer.getSkills().getSkill(1000).setKnowledge(1.0001,false); // Swords
                aPlayer.getSkills().getSkill(10027).setKnowledge(1.0001,false); // Sword short
                aPlayer.getSkills().getSkill(10005).setKnowledge(1.0001,false); // Sword Long
                aPlayer.getSkills().getSkill(10046).setKnowledge(1.0001,false); // Sickle
                aPlayer.getSkills().getSkill(1002).setKnowledge(1.0001,false); //Group Shields
                aPlayer.getSkills().getSkill(10006).setKnowledge(1.0001,false); // Medium Metal
                aPlayer.getSkills().getSkill(10019).setKnowledge(1.0001,false); // Small WOod
                aPlayer.getSkills().getSkill(10020).setKnowledge(1.0001,false); // Medium Wood
                aPlayer.getSkills().getSkill(10021).setKnowledge(1.0001,false); // Large Wood
                aPlayer.getSkills().getSkill(10022).setKnowledge(1.0001,false); // Small Metal Shield
                aPlayer.getSkills().getSkill(10023).setKnowledge(1.0001,false); // Large Metal Shield

                aPlayer.getSkills().getSkill(1025).setKnowledge(1.0001,false); // Clubs
                aPlayer.getSkills().getSkill(10064).setKnowledge(1.0001,false); // Huge Club

            }
           if (deityNum>=2&&deityNum<=4) // Normal Priests get nothing
           {
               aPlayer.getSkills().getSkill(1030).setKnowledge(1.0001,false);// Archery
               aPlayer.getSkills().getSkill(10080).setKnowledge(1.0001,false); // Bow Short
               aPlayer.getSkills().getSkill(10079).setKnowledge(1.0001,false);// Bow Medium
               aPlayer.getSkills().getSkill(10081).setKnowledge(1.0001,false); // Bow Long
               aPlayer.getSkills().getSkill(1004).setKnowledge(1.0001,false); // Mauls
               aPlayer.getSkills().getSkill(10061).setKnowledge(1.0001,false); // Maul Large
               aPlayer.getSkills().getSkill(10062).setKnowledge(1.0001,false); // Maul Medium
               aPlayer.getSkills().getSkill(10063).setKnowledge(1.0001,false); // Maul Small
               aPlayer.getSkills().getSkill(1003).setKnowledge(1.0001,false); // Axes
               aPlayer.getSkills().getSkill(10001).setKnowledge(1.0001,false); // Axe Small
               aPlayer.getSkills().getSkill(10024).setKnowledge(1.0001,false); // Axe large
               aPlayer.getSkills().getSkill(10025).setKnowledge(1.0001,false); // Axe huge
               aPlayer.getSkills().getSkill(1000).setKnowledge(1.0001,false); // Swords
               aPlayer.getSkills().getSkill(10027).setKnowledge(1.0001,false); // Sword short
               aPlayer.getSkills().getSkill(10005).setKnowledge(1.0001,false); // Sword Long
               aPlayer.getSkills().getSkill(10046).setKnowledge(1.0001,false); // Sickle
               aPlayer.getSkills().getSkill(1002).setKnowledge(1.0001,false); //Group Shields
               aPlayer.getSkills().getSkill(10006).setKnowledge(1.0001,false); // Medium Metal
               aPlayer.getSkills().getSkill(10019).setKnowledge(1.0001,false); // Small WOod
               aPlayer.getSkills().getSkill(10020).setKnowledge(1.0001,false); // Medium Wood
               aPlayer.getSkills().getSkill(10021).setKnowledge(1.0001,false); // Large Wood
               aPlayer.getSkills().getSkill(10022).setKnowledge(1.0001,false); // Small Metal Shield
               aPlayer.getSkills().getSkill(10023).setKnowledge(1.0001,false); // Large Metal Shield
               aPlayer.getSkills().getSkill(1033).setKnowledge(1.0001,false); // Polearms
               aPlayer.getSkills().getSkill(10088).setKnowledge(1.0001,false); // Spear Long
               aPlayer.getSkills().getSkill(1025).setKnowledge(1.0001,false); // Clubs
               aPlayer.getSkills().getSkill(10064).setKnowledge(1.0001,false); // Huge Club
               aPlayer.getSkills().getSkill(10089).setKnowledge(1.0001,false); // Halberd
               aPlayer.getSkills().getSkill(10090).setKnowledge(1.0001,false); // Staff
           }

           if (deityNum==101||deityNum==105||deityNum==107) // Hawkeye, Silverranger, Phantomranger
           {


               aPlayer.getSkills().getSkill(10061).setKnowledge(1.0001,false); // Maul Large
               aPlayer.getSkills().getSkill(10062).setKnowledge(1.0001,false); // Maul Medium


               aPlayer.getSkills().getSkill(10024).setKnowledge(1.0001,false); // Axe large
               aPlayer.getSkills().getSkill(10025).setKnowledge(1.0001,false); // Axe huge

               aPlayer.getSkills().getSkill(10005).setKnowledge(1.0001,false); // Sword Long
               aPlayer.getSkills().getSkill(10046).setKnowledge(1.0001,false); // Sickle
               aPlayer.getSkills().getSkill(1002).setKnowledge(1.0001,false); //Group Shields
               aPlayer.getSkills().getSkill(10006).setKnowledge(1.0001,false); // Medium Metal
               aPlayer.getSkills().getSkill(10019).setKnowledge(1.0001,false); // Small WOod
               aPlayer.getSkills().getSkill(10020).setKnowledge(1.0001,false); // Medium Wood
               aPlayer.getSkills().getSkill(10021).setKnowledge(1.0001,false); // Large Wood
               aPlayer.getSkills().getSkill(10022).setKnowledge(1.0001,false); // Small Metal Shield
               aPlayer.getSkills().getSkill(10023).setKnowledge(1.0001,false); // Large Metal Shield
               aPlayer.getSkills().getSkill(1033).setKnowledge(1.0001,false); // Polearms
               aPlayer.getSkills().getSkill(10088).setKnowledge(1.0001,false); // Spear Long
               aPlayer.getSkills().getSkill(1025).setKnowledge(1.0001,false); // Clubs
               aPlayer.getSkills().getSkill(10064).setKnowledge(1.0001,false); // Huge Club
               aPlayer.getSkills().getSkill(10089).setKnowledge(1.0001,false); // Halberd
               aPlayer.getSkills().getSkill(10090).setKnowledge(1.0001,false); // Staff
           }

            if (deityNum==102||deityNum==104||deityNum==108) // Avenger, Shillenknight, Templeknight
            {
                aPlayer.getSkills().getSkill(1030).setKnowledge(1.0001,false);// Archery
                aPlayer.getSkills().getSkill(10080).setKnowledge(1.0001,false); // Bow Short
                aPlayer.getSkills().getSkill(10079).setKnowledge(1.0001,false);// Bow Medium
                aPlayer.getSkills().getSkill(10081).setKnowledge(1.0001,false); // Bow Long


                aPlayer.getSkills().getSkill(10062).setKnowledge(1.0001,false); // Maul Medium
                aPlayer.getSkills().getSkill(10063).setKnowledge(1.0001,false); // Maul Small
                aPlayer.getSkills().getSkill(1003).setKnowledge(1.0001,false); // Axes
                aPlayer.getSkills().getSkill(10001).setKnowledge(1.0001,false); // Axe Small

                aPlayer.getSkills().getSkill(10025).setKnowledge(1.0001,false); // Axe huge

                aPlayer.getSkills().getSkill(10027).setKnowledge(1.0001,false); // Sword short

                aPlayer.getSkills().getSkill(10046).setKnowledge(1.0001,false); // Sickle

                aPlayer.getSkills().getSkill(10006).setKnowledge(1.0001,false); // Medium Metal
                aPlayer.getSkills().getSkill(10019).setKnowledge(1.0001,false); // Small WOod
                aPlayer.getSkills().getSkill(10020).setKnowledge(1.0001,false); // Medium Wood

                aPlayer.getSkills().getSkill(10022).setKnowledge(1.0001,false); // Small Metal Shield

                aPlayer.getSkills().getSkill(1033).setKnowledge(1.0001,false); // Polearms
                aPlayer.getSkills().getSkill(10088).setKnowledge(1.0001,false); // Spear Long
                aPlayer.getSkills().getSkill(1025).setKnowledge(1.0001,false); // Clubs
                aPlayer.getSkills().getSkill(10064).setKnowledge(1.0001,false); // Huge Club
                aPlayer.getSkills().getSkill(10089).setKnowledge(1.0001,false); // Halberd
                aPlayer.getSkills().getSkill(10090).setKnowledge(1.0001,false); // Staff
            }

            if (deityNum==103||deityNum==106) // Oracle, Prophet
            {
                aPlayer.getSkills().getSkill(1030).setKnowledge(1.0001,false);// Archery
                aPlayer.getSkills().getSkill(10080).setKnowledge(1.0001,false); // Bow Short
                aPlayer.getSkills().getSkill(10079).setKnowledge(1.0001,false);// Bow Medium
                aPlayer.getSkills().getSkill(10081).setKnowledge(1.0001,false); // Bow Long
                aPlayer.getSkills().getSkill(1004).setKnowledge(1.0001,false); // Mauls
                aPlayer.getSkills().getSkill(10061).setKnowledge(1.0001,false); // Maul Large
                aPlayer.getSkills().getSkill(10062).setKnowledge(1.0001,false); // Maul Medium
                aPlayer.getSkills().getSkill(10063).setKnowledge(1.0001,false); // Maul Small
                aPlayer.getSkills().getSkill(1003).setKnowledge(1.0001,false); // Axes
                aPlayer.getSkills().getSkill(10001).setKnowledge(1.0001,false); // Axe Small
                aPlayer.getSkills().getSkill(10024).setKnowledge(1.0001,false); // Axe large
                aPlayer.getSkills().getSkill(10025).setKnowledge(1.0001,false); // Axe huge
                aPlayer.getSkills().getSkill(1000).setKnowledge(1.0001,false); // Swords
                aPlayer.getSkills().getSkill(10027).setKnowledge(1.0001,false); // Sword short
                aPlayer.getSkills().getSkill(10005).setKnowledge(1.0001,false); // Sword Long


                aPlayer.getSkills().getSkill(10006).setKnowledge(1.0001,false); // Medium Metal

                aPlayer.getSkills().getSkill(10020).setKnowledge(1.0001,false); // Medium Wood
                aPlayer.getSkills().getSkill(10021).setKnowledge(1.0001,false); // Large Wood

                aPlayer.getSkills().getSkill(10023).setKnowledge(1.0001,false); // Large Metal Shield
                aPlayer.getSkills().getSkill(1033).setKnowledge(1.0001,false); // Polearms
                aPlayer.getSkills().getSkill(10088).setKnowledge(1.0001,false); // Spear Long
                aPlayer.getSkills().getSkill(1025).setKnowledge(1.0001,false); // Clubs
                aPlayer.getSkills().getSkill(10064).setKnowledge(1.0001,false); // Huge Club
                aPlayer.getSkills().getSkill(10089).setKnowledge(1.0001,false); // Halberd
                aPlayer.getSkills().getSkill(10090).setKnowledge(1.0001,false); // Staff
            }




            aPlayer.getCommunicator().sendSafeServerMessage("Becoming a priest filled your body with magic powers, but somehow you feel your knowledge concerning some other combat skills has vanished.");
            TorkelsSadisticPriestRestrictions.logger.log(Level.INFO,"Resetting skills for player: "+ aPlayer.getName()+" because they priested");
        } catch (NoSuchSkillException e) {
            e.printStackTrace();
        }
        try {
            aPlayer.getEquippedItem((byte)38);
        } catch (NoSpaceException e) {
            throw new RuntimeException(e);
        }


    
    }
    


   /*
private final void doSkillGainNew(double check, double power, double learnMod, float times, double skillDivider) {
    double bonus = 1.0D;
    double diff = Math.abs(check - this.knowledge);
    short sType = SkillSystem.getTypeFor(this.number);
    boolean awardBonus = true;
    if (sType == 1 || sType == 0)
      awardBonus = false;
    if (diff <= 15.0D && awardBonus)
      bonus = 1.0D   0.10000000149011612D * diff / 15.0D;
    if (power < 0.0D) {
      if (this.knowledge < 20.0D)
        alterSkill((100.0D - this.knowledge) / getDifficulty(this.parent.priest) * this.knowledge * this.knowledge * learnMod * bonus, false, times, true, skillDivider);
    } else {
      alterSkill((100.0D - this.knowledge) / getDifficulty(this.parent.priest) * this.knowledge * this.knowledge * learnMod * bonus, false, times, true, skillDivider);
    }
  }

  private final void doSkillGainOld(double power, double learnMod, float times) {
    if (power >= 0.0D)
      if (this.knowledge < 20.0D) {
        alterSkill((100.0D - this.knowledge) / getDifficulty(this.parent.priest) * this.knowledge * this.knowledge * learnMod, false, times);
      } else if (power > 0.0D && power < 40.0D) {
        alterSkill((100.0D - this.knowledge) / getDifficulty(this.parent.priest) * this.knowledge * this.knowledge * learnMod, false, times);
      } else if (this.number == 10055 || this.number == 10053 || this.number == 10054) {
        Creature cret = null;
        try {
          cret = Server.getInstance().getCreature(this.parent.getId());
          if (cret.loggerCreature1 > 0L)
            logger.log(Level.INFO, cret

                .getName() + " POWER=" + power);
        } catch (NoSuchCreatureException noSuchCreatureException) {

        } catch (NoSuchPlayerException noSuchPlayerException) {}
      }
  }
    */
}
