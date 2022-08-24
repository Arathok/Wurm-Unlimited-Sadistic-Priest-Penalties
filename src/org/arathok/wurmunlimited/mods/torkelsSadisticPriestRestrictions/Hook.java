package org.arathok.wurmunlimited.mods.torkelsSadisticPriestRestrictions;

import com.wurmonline.server.Players;
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
            aPlayer.getSkills().getSkill(1030).setKnowledge(1.0001,false);

        aPlayer.getSkills().getSkill(10080).setKnowledge(1.0001,false);
        aPlayer.getSkills().getSkill(10081).setKnowledge(1.0001,false);
        aPlayer.getSkills().getSkill(10062).setKnowledge(1.0001,false);
        aPlayer.getSkills().getSkill(10063).setKnowledge(1.0001,false);
        aPlayer.getSkills().getSkill(10001).setKnowledge(1.0001,false);
        aPlayer.getSkills().getSkill(10024).setKnowledge(1.0001,false);
        aPlayer.getSkills().getSkill(10027).setKnowledge(1.0001,false);
        aPlayer.getSkills().getSkill(10005).setKnowledge(1.0001,false);
        aPlayer.getSkills().getSkill(10046).setKnowledge(1.0001,false);
        aPlayer.getSkills().getSkill(1002).setKnowledge(1.0001,false);
        aPlayer.getSkills().getSkill(10006).setKnowledge(1.0001,false);
        aPlayer.getSkills().getSkill(10019).setKnowledge(1.0001,false);
        aPlayer.getSkills().getSkill(10020).setKnowledge(1.0001,false);
        aPlayer.getSkills().getSkill(10021).setKnowledge(1.0001,false);
        aPlayer.getSkills().getSkill(10022).setKnowledge(1.0001,false);
        aPlayer.getSkills().getSkill(10023).setKnowledge(1.0001,false);
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
      bonus = 1.0D + 0.10000000149011612D * diff / 15.0D;
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
