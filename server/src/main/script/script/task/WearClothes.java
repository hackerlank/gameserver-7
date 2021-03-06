package script.task;

import com.xinqihd.sns.gameserver.config.Pojo;
import com.xinqihd.sns.gameserver.config.TaskPojo;
import com.xinqihd.sns.gameserver.config.equip.EquipType;
import com.xinqihd.sns.gameserver.config.equip.WeaponPojo;
import com.xinqihd.sns.gameserver.db.mongo.TaskManager.TaskHook;
import com.xinqihd.sns.gameserver.entity.user.PropData;
import com.xinqihd.sns.gameserver.entity.user.User;
import com.xinqihd.sns.gameserver.script.ScriptManager;
import com.xinqihd.sns.gameserver.script.ScriptResult;
import com.xinqihd.sns.gameserver.util.TaskStep;

/**
 * 
 * 
 * Parameters:							
 * user, task, TaskHook.WEAR, PropData
 * 
 * @author wangqi
 *
 */
public class WearClothes {

	public static ScriptResult func(Object[] parameters) {
		ScriptResult result = ScriptManager.checkParameters(parameters, 3);
		if ( result != null ) {
			return result;
		}
		User user = (User)parameters[0];
		TaskPojo task = (TaskPojo)parameters[1];
		TaskHook hook = (TaskHook)parameters[2];
		if ( hook == TaskHook.WEAR ) {
			Object[] array = (Object[])parameters[3];
			PropData equipPropData = (PropData)array[0];
			
			Pojo pojo = equipPropData.getPojo();
			if ( pojo instanceof WeaponPojo ) {
				WeaponPojo weapon = (WeaponPojo)pojo;
				if ( weapon.getSlot() == EquipType.CLOTHES ) {
					TaskStep.step(task, user);
				}
			}
		}		
		
		result = new ScriptResult();
		result.setType(ScriptResult.Type.SUCCESS);
		result.setResult(null);
		return result;
	}
	
}
