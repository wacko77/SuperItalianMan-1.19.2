package net.tyler.superitalianman.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class Mega_Mushroom extends Item {

    public Mega_Mushroom(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {

        livingEntity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1200, 10));

        return this.isEdible() ? livingEntity.eat(level, stack) : stack;
    }

}