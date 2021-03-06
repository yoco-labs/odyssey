package io.yooksi.odyssey.entity.ai.goal;

import io.yooksi.odyssey.entity.passive.CamelEntity;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;

/**
 * This alters the behavior of the {@link WaterAvoidingRandomWalkingGoal} by only allowing the camel to
 * wander if it has not been tamed.
 *
 * @author codetaylor
 */
public class CamelWanderGoal
		extends WaterAvoidingRandomWalkingGoal {

	private CamelEntity camelEntity;

	public CamelWanderGoal(CamelEntity camelEntity, double speed) {

		super(camelEntity, speed);
		this.camelEntity = camelEntity;
	}

	@Override
	public boolean shouldExecute() {

		return !this.camelEntity.isTame() && super.shouldExecute();
	}
}
