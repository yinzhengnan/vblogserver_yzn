package org.neuedu.blog.controller.column;

import org.neuedu.blog.model.Column;
import org.neuedu.blog.model.RespBean;
import org.neuedu.blog.service.ColumnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/column")
public class ColumnController {
    @Autowired
    ColumnService columnService;
    @GetMapping("/getAllColumn")
    public RespBean getAllColumn(){
        return columnService.getAllColumn();
    }

    @PostMapping("/")
    public RespBean addColumn(@RequestBody Column column) {
        return columnService.addColumn(column);
    }

    @DeleteMapping("/{id}")
    public RespBean delColumn(@PathVariable("id") String id) {
        return columnService.delColumn(id);
    }

    @PutMapping("/")
    public RespBean updateColumn(@RequestBody Column column) {
        return columnService.updateColumn(column);
    }

    @DeleteMapping("/")
    public RespBean deleteMany(Integer[] ids) {
        return columnService.deleteMany(ids);
    }
}
