package org.neuedu.blog.service;

import org.neuedu.blog.mapper.ColumnMapper;
import org.neuedu.blog.model.Column;
import org.neuedu.blog.model.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColumnService {
    @Autowired
    ColumnMapper columnMapper;
    public RespBean getAllColumn() {
        List<Column> columns = columnMapper.getAllColumn();
        if (columns != null) {
            return RespBean.ok("查询栏目成功", columns);
        }else{
            return RespBean.error("查询栏目失败");
        }
    }

    public RespBean addColumn(Column column) {
        int i = columnMapper.addColumn(column);
        if (i == 1) {
            return RespBean.ok("新增栏目成功");
        }else{
            return RespBean.error("新增栏目失败");
        }
    }

    public RespBean delColumn(String id) {
        int i = columnMapper.delColumn(id);
        if (i == 1) {
            return RespBean.ok("删除栏目成功");
        }else{
            return RespBean.error("删除栏目失败");
        }
    }

    public RespBean updateColumn(Column column) {
        int i = columnMapper.updateColumn(column);
        if (i == 1) {
            return RespBean.ok("更新栏目成功");
        }else{
            return RespBean.error("更新栏目失败");
        }
    }

    public RespBean deleteMany(Integer[] ids) {
        int i = columnMapper.deleteMany(ids);
        if (i == 0) {
            return RespBean.error("批量删除失败");
        }else{
            return RespBean.ok("删除成功");
        }
    }
}
