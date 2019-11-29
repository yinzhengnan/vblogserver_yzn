package org.neuedu.blog.mapper;

import org.apache.ibatis.annotations.Param;
import org.neuedu.blog.model.Column;

import java.util.List;

public interface ColumnMapper {
    List<Column> getAllColumn();

    int addColumn(Column column);

    int delColumn(String id);

    int updateColumn(Column column);

    int deleteMany(@Param("ids") Integer[] ids);
}
