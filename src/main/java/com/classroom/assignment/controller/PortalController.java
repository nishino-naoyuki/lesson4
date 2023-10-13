package com.classroom.assignment.controller;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.classroom.assignment.entity.Archievement;
import com.classroom.assignment.entity.Lesson;
import com.classroom.assignment.entity.Weather;
import com.classroom.assignment.service.ArchievementService;
import com.classroom.assignment.service.FortuneService;
import com.classroom.assignment.service.GreetingService;
import com.classroom.assignment.service.LessonService;
import com.classroom.assignment.service.WeatherService;

@Controller
@RequestMapping("/")
public class PortalController {
  private final LessonService lessonService;
  private final ArchievementService archievementService;
  private final GreetingService greetingService;
  private final FortuneService fortuneService;
  private final WeatherService weatherService;

  @Autowired
  public PortalController(LessonService lessonService,
      GreetingService greetingService,
      FortuneService fortuneService,
      WeatherService weatherService,
      ArchievementService archievementService) {
    this.lessonService = lessonService;
    this.archievementService = archievementService;
    this.greetingService = greetingService;
    this.fortuneService = fortuneService;
    this.weatherService = weatherService;
  }

  @GetMapping()
  public String index(Model model) {
    // 現在の日付
    LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));

    // 日付表示
    model.addAttribute("date", now);
    model.addAttribute("dayOfWeek",
        now.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.JAPAN));

    // 名前表示
    model.addAttribute("name", "○○"); // ○○を書き換えて名前を表示

    // 天気表示
    Weather weather = weatherService.findWeather();
    model.addAttribute("weather", weather);

    // おみくじ
    String omikuji = fortuneService.omikuji(); // GreetingServiceのgreetingメソッドを実装
    String omikujiIcon = fortuneService.omikujiIcon(omikuji);
    model.addAttribute("omikuji", omikuji);
    model.addAttribute("omikujiIcon", omikujiIcon);

    // 挨拶表示
    String greeting = greetingService.greeting(now); // GreetingServiceのgreetingメソッドを実装
    model.addAttribute("greeting", greeting);

    // 本日の授業
    List<Lesson> lessonList = lessonService.selectByDay(now.getDayOfWeek().getValue()); // lessonServiceをたどり、sql文の記載箇所を修正
    model.addAttribute("lessonList", lessonList);

    // すべての実績表示
    List<Archievement> archievementList = archievementService.selectAll();
    model.addAttribute("archievementList", archievementList);

    return "index";
  }
}
