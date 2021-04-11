package kz.sitedev.lms;

import kz.sitedev.lms.config.Config;
import kz.sitedev.lms.controller.BooksController;
import kz.sitedev.lms.controller.ReqsController;
import kz.sitedev.lms.controller.UsersController;
import kz.sitedev.lms.entity.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//        Scanner L = new Scanner(System.in);
//
//        Req req;
//        StatusReq statusReq;
//        List<User> users;
//        Long id;
//        List<StatusReq> statusReqs;
//
//        int ch = -1;
//
//        while (ch != 0){
//            System.out.println("1.Book requests by members");
//            System.out.println("2.Book issue");
//            System.out.println("3.Book return");
//            System.out.println("4.Adding new collection of books");
//            System.out.println("5.Search for books by name");
//            System.out.println("6.Search for books by description");
//            System.out.println("7.Search for books by author");
//            System.out.println("8.Show all Issued Books");
//            System.out.println("9.Show all Requested Books");
//            System.out.println("10.Show all books Over due date");
//            System.out.println("0.Exit");
//            ch = L.nextInt();
//
//            switch (ch){
//                case 1:
//                    users = context.getBean("usersController", UsersController.class).all();
//
//                    System.out.println("===============================================");
//                    for (User user : users){
//                        System.out.println(user.toString());
//                    }
//                    System.out.println("===============================================");
//                    System.out.println("User ID:");
//                    id = L.nextLong();
//                    req = context.getBean("reqsController", ReqsController.class).find(id);
//                    statusReq = context.getBean("statusReqsController", StatusReqsController.class).findFirstByReqId(req.getId());
//                    statusReq.setStatusId(2L);
//                    break;
//                case 2:
//                    users = context.getBean("usersController", UsersController.class).all();
//
//                    System.out.println("===============================================");
//                    for (User user : users){
//                        System.out.println(user.toString());
//                    }
//                    System.out.println("===============================================");
//                    System.out.println("User ID:");
//                    id = L.nextLong();
//                    req = context.getBean("reqsController", ReqsController.class).find(id);
//                    statusReq = context.getBean("statusReqsController", StatusReqsController.class).findFirstByReqId(req.getId());
//                    statusReq.setStatusId(1L);
//                    break;
//                case 3:
//                    users = context.getBean("usersController", UsersController.class).all();
//
//                    System.out.println("===============================================");
//                    for (User user : users){
//                        System.out.println(user.toString());
//                    }
//                    System.out.println("===============================================");
//                    System.out.println("User ID:");
//                    id = L.nextLong();
//                    req = context.getBean("reqsController", ReqsController.class).find(id);
//                    statusReq = context.getBean("statusReqsController", StatusReqsController.class).findFirstByReqId(req.getId());
//                    statusReq.setStatusId(4L);
//                    break;
//                case 4:
//                    Book book = new Book();
//                    System.out.println("Author:");
//                    book.setAuthor(L.next());
//                    System.out.println("Description:");
//                    book.setDescription(L.next());
//                    System.out.println("Title:");
//                    book.setTitle(L.next());
//                    context.getBean("booksController", BooksController.class).create(book);
//                    break;
//                case 5:
//                    System.out.println("Input:");
//                    context.getBean("booksController", BooksController.class).findByTitle(L.next());
//                    break;
//                case 6:
//                    System.out.println("Input:");
//                    context.getBean("booksController", BooksController.class).getByDescription(L.next());
//                    break;
//                case 7:
//                    System.out.println("Input:");
//                    context.getBean("booksController", BooksController.class).getByAuthor(L.next());
//                    break;
//                case 8:
//                    statusReqs = context.getBean("statusReqsController", StatusReqsController.class).findByStatusId(1L);
//                    for (StatusReq statusReq1 : statusReqs){
//                        System.out.println(statusReq1.toString());
//                    }
//                    break;
//                case 9:
//                    statusReqs = context.getBean("statusReqsController", StatusReqsController.class).findByStatusId(2L);
//                    for (StatusReq statusReq1 : statusReqs){
//                        System.out.println(statusReq1.toString());
//                    }
//                    break;
//                case 10:
//                    statusReqs = context.getBean("statusReqsController", StatusReqsController.class).findByStatusId(3L);
//                    for (StatusReq statusReq1 : statusReqs){
//                        System.out.println(statusReq1.toString());
//                    }
//                    break;
//            }
//        }
    }
}
