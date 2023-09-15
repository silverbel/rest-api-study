package me.study.restapistudy.events;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EventTest {

    @Test
    public void builder() {
        Event event = Event.builder()
                .name("Inflearn Spring REST api")
                .description("REST API development with Spring")
                .build();
        assertThat(event).isNotNull();
    }

    // @Builder를 생성하면 디폴트 생성자는 만들어지지 않는다
    // test 실행 단축키 : ctrl + shift + r
    // 동일 문자열 변수 리팩토링 : option + cmd + v
    @Test
    public void javaBean() {

        // given
        String eventName = "Event";
        String eventDescription = "Spring";

        // when
        Event event = new Event();
        event.setName(eventName);
        event.setDescription(eventDescription);

        // then
        assertThat(event.getName()).isEqualTo(eventName);
        assertThat(event.getDescription()).isEqualTo(eventDescription);
    }
}