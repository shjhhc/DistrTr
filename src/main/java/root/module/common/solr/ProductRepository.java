package root.module.common.solr;

import org.springframework.data.solr.repository.SolrCrudRepository;

import java.util.List;

/**
 * Created by m on 2016/10/26.
 */
public interface ProductRepository extends SolrCrudRepository<Product, String> {
    List<Product> findByNameStartingWith(String name);
}
