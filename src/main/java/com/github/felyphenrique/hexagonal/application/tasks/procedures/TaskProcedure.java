package com.github.felyphenrique.hexagonal.application.tasks.procedures;

import com.github.felyphenrique.hexagonal.application.tasks.procedures.Task.TaskFilter;
import com.github.felyphenrique.hexagonal.application.tasks.procedures.Task.TaskListReponse;
import com.github.felyphenrique.hexagonal.application.tasks.procedures.Task.TaskRequest;
import com.github.felyphenrique.hexagonal.application.tasks.procedures.Task.TaskResponse;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class TaskProcedure extends TaskProcedureGrpc.TaskProcedureImplBase {

    @Override
    public void index(TaskFilter request, StreamObserver<TaskListReponse> responseObserver) {
        // TODO Auto-generated method stub
        super.index(request, responseObserver);
    }

    @Override
    public void show(TaskRequest request, StreamObserver<TaskResponse> responseObserver) {
        // TODO Auto-generated method stub
        super.show(request, responseObserver);
    }

    @Override
    public void create(TaskRequest request, StreamObserver<TaskResponse> responseObserver) {
        // TODO Auto-generated method stub
        super.create(request, responseObserver);
    }

    @Override
    public void update(TaskRequest request, StreamObserver<TaskResponse> responseObserver) {
        // TODO Auto-generated method stub
        super.update(request, responseObserver);
    }

    @Override
    public void delete(TaskRequest request, StreamObserver<TaskResponse> responseObserver) {
        // TODO Auto-generated method stub
        super.delete(request, responseObserver);
    }
}
