package poly.cafe.dao;

import java.util.List;
import poly.cafe.entity.Drink;

/**
 *
 * @author phupham
 */
public interface DrinkDAO extends CrudDAO<Drink,String> {
    List<Drink> findByCategoryId(String categoryId);
}
