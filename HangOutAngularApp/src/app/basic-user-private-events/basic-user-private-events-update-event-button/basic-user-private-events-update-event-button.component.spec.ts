import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BasicUserPrivateEventsUpdateEventButtonComponent } from './basic-user-private-events-update-event-button.component';

describe('BasicUserPrivateEventsUpdateEventButtonComponent', () => {
  let component: BasicUserPrivateEventsUpdateEventButtonComponent;
  let fixture: ComponentFixture<BasicUserPrivateEventsUpdateEventButtonComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BasicUserPrivateEventsUpdateEventButtonComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BasicUserPrivateEventsUpdateEventButtonComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
