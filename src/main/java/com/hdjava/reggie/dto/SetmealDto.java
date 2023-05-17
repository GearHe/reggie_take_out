package com.hdjava.reggie.dto;

import com.hdjava.reggie.entity.Setmeal;
import com.hdjava.reggie.entity.SetmealDish;
import com.hdjava.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
