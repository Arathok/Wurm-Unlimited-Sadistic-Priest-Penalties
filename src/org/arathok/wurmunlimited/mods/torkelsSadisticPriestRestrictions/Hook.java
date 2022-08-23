package org.arathok.wurmunlimited.mods.torkelsSadisticPriestRestrictions;

import com.wurmonline.server.Players;
import com.wurmonline.server.players.Player;

import com.wurmonline.server.skills.*;
import org.gotti.wurmunlimited.modloader.ReflectionUtil;
import sun.reflect.misc.FieldUtil;

import java.lang.reflect.Field;
import java.util.logging.Level;

public class Hook {
public static Field parent;
    public void version3(Skill askill) {
        try {
            parent = FieldUtil.getField(Skill.class, "parent");

        } catch (NoSuchFieldException e) {
            TorkelsSadisticPriestRestrictions.logger.log(Level.SEVERE, "no such field", e);
            throw new RuntimeException(e);
        }
        parent.setAccessible(true);
        Class<?> targetType = parent.getType();
        Skills parent2;
        try {
            Object objectValue = targetType.newInstance();
            Object objectValue2 = parent.get(objectValue);
            parent2 = (Skills) objectValue2;
        } catch (InstantiationException | IllegalAccessException e) {
            TorkelsSadisticPriestRestrictions.logger.log(Level.SEVERE,"No Access or Instantation",e);
            throw new RuntimeException(e);
        }


        Player p = null;
        p = Players.getInstance().getPlayerOrNull(parent2.getId());
        if (p!=null) {
            TorkelsSadisticPriestRestrictions.logger.log(Level.SEVERE, "Playernotfound!");
            if (p.isPriest())
                p.getCommunicator().sendSafeServerMessage("The Magic that flows through your body now, makes it unwilling to use most battle weapons. You will gain no experience in " + askill.getName() + ".");
                return;
        }
        else
            TorkelsSadisticPriestRestrictions.logger.log(Level.SEVERE,"Playerfound!");


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
