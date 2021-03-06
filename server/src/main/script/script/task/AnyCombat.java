package script.task;

import com.xinqihd.sns.gameserver.battle.RoomType;
import com.xinqihd.sns.gameserver.config.TaskPojo;
import com.xinqihd.sns.gameserver.db.mongo.TaskManager.TaskHook;
import com.xinqihd.sns.gameserver.entity.user.User;
import com.xinqihd.sns.gameserver.script.ScriptManager;
import com.xinqihd.sns.gameserver.script.ScriptResult;
import com.xinqihd.sns.gameserver.util.TaskStep;

/**
 * After the user join the given 'step' number of combat,
 * the task is finished.
 * 
 * @author wangqi
 *
 */
public class AnyCombat {

	public static ScriptResult func(Object[] parameters) {
		ScriptResult result = ScriptManager.checkParameters(parameters, 3);
		if ( result != null ) {
			return result;
		}
		User user = (User)parameters[0];
		TaskPojo task = (TaskPojo)parameters[1];
		TaskHook hook = (TaskHook)parameters[2];
		if ( hook == TaskHook.COMBAT ) {
			Object[] array = (Object[])parameters[3];
			boolean winner = (Boolean)array[0];
			int totalUserNumber = (Integer)array[1];
			RoomType roomType = (RoomType)array[2];

			if ( roomType == RoomType.SINGLE_ROOM || 
					roomType == RoomType.CHALLENGE_ROOM ||
					roomType == RoomType.FRIEND_ROOM ||
					roomType == RoomType.GUILD_ROOM ||
					roomType == RoomType.PVE_ROOM ||
					roomType == RoomType.RANK_ROOM ||
					roomType == RoomType.OFFLINE_ROOM ||
					roomType == RoomType.MULTI_ROOM ) {
				TaskStep.step(task, user);
			}
		}
		
		result = new ScriptResult();
		result.setType(ScriptResult.Type.SUCCESS);
		result.setResult(null);
		return result;
	}
	
}
